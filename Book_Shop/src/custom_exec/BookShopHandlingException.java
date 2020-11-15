package custom_exec;

@SuppressWarnings("serial")
public class BookShopHandlingException extends Exception{
		public BookShopHandlingException(String errorMesg) {
			super(errorMesg);
		}
}
