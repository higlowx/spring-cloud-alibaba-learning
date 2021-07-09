package com.higlowx.scal.ebpp.common.utils;

import com.higlowx.scal.ebpp.common.ex.UnifiedException;
import com.higlowx.scal.ebpp.common.res.UnifiedResponseCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */

public class AssertUtils {

    public static void isNull(@Nullable Object object) {
        if (object != null) {
            throw new UnifiedException();
        }
    }

    public static void isNull(@Nullable Object object, String message) {
        if (object != null) {
            throw new UnifiedException(message);
        }
    }

    public static void isNull(@Nullable Object object, UnifiedResponseCode code, String message) {
        if (object != null) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isNull(@Nullable Object object, UnifiedResponseCode code) {
        if (object != null) {
            throw new UnifiedException(code);
        }
    }

    public static void isNull(@Nullable Object object, int code) {
        if (object != null) {
            throw new UnifiedException(code);
        }
    }

    public static void isNull(@Nullable Object object, int code, String msg) {
        if (object != null) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notNull(@Nullable Object object) {
        if (object == null) {
            throw new UnifiedException();
        }
    }

    public static void notNull(@Nullable Object object, String message) {
        if (object == null) {
            throw new UnifiedException(message);
        }
    }

    public static void notNull(@Nullable Object object, UnifiedResponseCode code, String message) {
        if (object == null) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notNull(@Nullable Object object, UnifiedResponseCode code) {
        if (object == null) {
            throw new UnifiedException(code);
        }
    }

    public static void notNull(@Nullable Object object, int code) {
        if (object == null) {
            throw new UnifiedException(code);
        }
    }

    public static void notNull(@Nullable Object object, int code, String msg) {
        if (object == null) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void isTrue(boolean expression) {
        if (!expression) {
            throw new UnifiedException();
        }
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new UnifiedException(message);
        }
    }

    public static void isTrue(boolean expression, UnifiedResponseCode code, String message) {
        if (!expression) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isTrue(boolean expression, UnifiedResponseCode code) {
        if (!expression) {
            throw new UnifiedException(code);
        }
    }

    public static void isTrue(boolean expression, int code) {
        if (!expression) {
            throw new UnifiedException(code);
        }
    }

    public static void isTrue(boolean expression, int code, String msg) {
        if (!expression) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notTrue(boolean expression) {
        if (expression) {
            throw new UnifiedException();
        }
    }

    public static void notTrue(boolean expression, String message) {
        if (expression) {
            throw new UnifiedException(message);
        }
    }

    public static void notTrue(boolean expression, UnifiedResponseCode code, String message) {
        if (expression) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notTrue(boolean expression, UnifiedResponseCode code) {
        if (expression) {
            throw new UnifiedException(code);
        }
    }

    public static void notTrue(boolean expression, int code) {
        if (expression) {
            throw new UnifiedException(code);
        }
    }

    public static void notTrue(boolean expression, int code, String msg) {
        if (expression) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void isEquals(Object object0, Object object1) {
        if (!object0.equals(object1)) {
            throw new UnifiedException();
        }
    }

    public static void isEquals(Object object0, Object object1, String message) {
        if (!object0.equals(object1)) {
            throw new UnifiedException(message);
        }
    }

    public static void isEquals(Object object0, Object object1, UnifiedResponseCode code, String message) {
        if (!object0.equals(object1)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isEquals(Object object0, Object object1, UnifiedResponseCode code) {
        if (!object0.equals(object1)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEquals(Object object0, Object object1, int code) {
        if (!object0.equals(object1)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEquals(Object object0, Object object1, int code, String msg) {
        if (!object0.equals(object1)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notEquals(Object object0, Object object1) {
        if (object0.equals(object1)) {
            throw new UnifiedException();
        }
    }

    public static void notEquals(Object object0, Object object1, String message) {
        if (object0.equals(object1)) {
            throw new UnifiedException(message);
        }
    }

    public static void notEquals(Object object0, Object object1, UnifiedResponseCode code, String message) {
        if (object0.equals(object1)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notEquals(Object object0, Object object1, UnifiedResponseCode code) {
        if (object0.equals(object1)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEquals(Object object0, Object object1, int code) {
        if (object0.equals(object1)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEquals(Object object0, Object object1, int code, String msg) {
        if (object0.equals(object1)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException();
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection, String message) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(message);
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection, UnifiedResponseCode code, String message) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection, UnifiedResponseCode code) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection, int code) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEmpty(@Nullable Collection<?> collection, int code, String msg) {
        if (!CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException();
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(message);
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection, UnifiedResponseCode code, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection, UnifiedResponseCode code) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection, int code) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEmpty(@Nullable Collection<?> collection, int code, String msg) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void isBlank(@Nullable String object) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException();
        }
    }

    public static void isBlank(@Nullable String object, String message) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException(message);
        }
    }

    public static void isBlank(@Nullable String object, UnifiedResponseCode code, String message) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isBlank(@Nullable String object, UnifiedResponseCode code) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void isBlank(@Nullable String object, int code) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void isBlank(@Nullable String object, int code, String msg) {
        if (StringUtils.isNotBlank(object)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notBlank(@Nullable String object) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException();
        }
    }

    public static void notBlank(@Nullable String object, String message) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException(message);
        }
    }

    public static void notBlank(@Nullable String object, UnifiedResponseCode code, String message) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notBlank(@Nullable String object, UnifiedResponseCode code) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void notBlank(@Nullable String object, int code) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void notBlank(@Nullable String object, int code, String msg) {
        if (StringUtils.isBlank(object)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void isEmpty(@Nullable String object) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException();
        }
    }

    public static void isEmpty(@Nullable String object, String message) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException(message);
        }
    }

    public static void isEmpty(@Nullable String object, UnifiedResponseCode code, String message) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void isEmpty(@Nullable String object, UnifiedResponseCode code) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEmpty(@Nullable String object, int code) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void isEmpty(@Nullable String object, int code, String msg) {
        if (StringUtils.isNotEmpty(object)) {
            throw new UnifiedException(code, msg);
        }
    }

    public static void notEmpty(@Nullable String object) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException();
        }
    }

    public static void notEmpty(@Nullable String object, String message) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException(message);
        }
    }

    public static void notEmpty(@Nullable String object, UnifiedResponseCode code, String message) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException(code, message);
        }
    }

    public static void notEmpty(@Nullable String object, UnifiedResponseCode code) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEmpty(@Nullable String object, int code) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException(code);
        }
    }

    public static void notEmpty(@Nullable String object, int code, String msg) {
        if (StringUtils.isEmpty(object)) {
            throw new UnifiedException(code, msg);
        }
    }
}
