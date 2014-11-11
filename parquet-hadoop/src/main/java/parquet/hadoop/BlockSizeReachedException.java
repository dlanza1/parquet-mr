package parquet.hadoop;

public class BlockSizeReachedException extends Exception {

	public BlockSizeReachedException() {
	}

	public BlockSizeReachedException(String message) {
		super(message);
	}

	public BlockSizeReachedException(Throwable cause) {
		super(cause);
	}

	public BlockSizeReachedException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlockSizeReachedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
