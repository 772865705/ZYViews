package com.zy.libs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Zhaoyue on 2017/8/11 0011.
 */
public class AutoCastEditText extends EditText {
    public AutoCastEditText(Context context) {
        super(context);
    }

    public AutoCastEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoCastEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public byte getByte() throws NumberFormatException {
        return Byte.valueOf(getText().toString());
    }

    public short getShort() throws NumberFormatException {
        return Short.valueOf(getText().toString());
    }

    public int getInt() throws NumberFormatException {
        return Integer.valueOf(getText().toString());
    }

    public long getLong() throws NumberFormatException {
        return Long.valueOf(getText().toString());
    }

    public boolean getBoolean() throws NumberFormatException {
        return Boolean.valueOf(getText().toString());
    }

    public char getChar() throws StringIndexOutOfBoundsException {
        return getText().toString().charAt(0);
    }

    public float getFloat() throws NumberFormatException {
        return Float.valueOf(getText().toString());
    }

    public double getDouble() throws NumberFormatException {
        return Double.valueOf(getText().toString());
    }
}
