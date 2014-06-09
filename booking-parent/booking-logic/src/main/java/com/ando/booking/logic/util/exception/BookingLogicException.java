package com.ando.booking.logic.util.exception;

/**
 * The {@link BookingLogicException} exception encapsulates any exception generated in booking logic-tier.
 * 
 * @author Zied ANDOLSI
 */
public class BookingLogicException extends Exception {

	/**
	 * {@link BookingLogicException}'s default serial identifier.
	 */
	private static final long serialVersionUID = -7920779797756759564L;

	/**
	 * Constructs a new <code>BookingLogicException</code>.It only calls the corresponding parent constructor.
	 */
	public BookingLogicException() {
		super();
	}

	/**
	 * Constructs a new <code>BookingLogicException</code> with the specified detail message. It only calls the
	 * corresponding parent constructor.
	 * 
	 * @param msg
	 *            message
	 */
	public BookingLogicException(String msg) {
		super(msg);
	}

	/**
	 * Constructs a new <code>BookingLogicException</code> with the specified detail message and encapsulated exception.
	 * It only calls the corresponding parent constructor.
	 * 
	 * @param msg
	 *            message
	 * @param e
	 *            throwable
	 */
	public BookingLogicException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * Constructs a new <code>BookingLogicException</code> with the encapsulated exception. It only calls the
	 * corresponding parent constructor.
	 * 
	 * @param e
	 *            throwable
	 */
	public BookingLogicException(Throwable e) {
		super(e);
	}
}
