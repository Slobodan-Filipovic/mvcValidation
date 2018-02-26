package config;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/*Ce da handluje nase exception, ako se desi neki error server error 500 bolje da korisnik dobije tu poruku nego
 * detaljnu gresku sta se desava. Dajemo mu savet sta da radi ukoliko se desi neki exception
 * Ovaj ControllerAdvice je poveziovao sa svim controllerima a ne samo veterinarKontroler*/
@ControllerAdvice
public class VeterinarskaAmbulantaExceptionHandler {

	/*
	 * Hvata samo exceptione tipa MethodArgumentNotValidException za
	 * VeterinarskaAmbulantaExceptionHandler-a koji je validator za
	 * veterinarController-a preko ControllerAdvice
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ResponseEntity<Object> validationNotPassed(MethodArgumentNotValidException ex) {

		/*
		 * Hvata binding iz VeterinarController, ovo:
		 * 
		 * @InitBinder public void bindValidator(WebDataBinder binder) {
		 * binder.setValidator(veterinarValidator); }
		 */
		BindingResult result = ex.getBindingResult();
		String errors = result.getAllErrors().stream().map(x -> x.getCode()).reduce((x, y) -> x + " " + y).get(); /*nauci  lambdu jebeno bre*/
																													
																													  
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}// Name is required! output in postman Screenshot: Name is required!

	/*
	 * U slucaju da ovaj deo ovde izkomentarisemo ostace nam celokupni error koji ce
	 * maliciozni korisnik moci da iskoristi mozda protiv nas. Zato sa ovime
	 * skrivamo error kinda, Screenshot: HTTP ERROR 500Problem accessing
	 */

	@ExceptionHandler(MojExceptionHandler.class) // output: screenshot nema ovog:7
	public @ResponseBody ResponseEntity<Object> wrongIdPassed(MojExceptionHandler ex) {

		// BindingResult result = ex.get ovo mi ne treba jer ce ga hvatati na osnovu mog
		// koji extenduje runTimeException
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
