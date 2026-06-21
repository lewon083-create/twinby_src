package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.MutableExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonExpressionParser {
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.EMPTY_LIST);

    @NonNull
    private static <V> ExpressionList<V> emptyExpressionList() {
        return (ExpressionList<V>) EMPTY_EXPRESSION_LIST;
    }

    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t10 = (T) jSONObject.opt(str);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), null);
    }

    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid());
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        Object objInvoke;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<? extends V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return emptyExpressionList();
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        boolean z5 = false;
        ParsingErrorLogger logger = null;
        for (int i = 0; i < length; i++) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray, i);
            if (objOptSafe != null) {
                if (Expression.mayBeExpression(objOptSafe)) {
                    if (logger == null) {
                        logger = parsingContext.getLogger();
                    }
                    ParsingErrorLogger parsingErrorLogger = logger;
                    arrayList.add(new Expression.MutableExpression(str + "[" + i + "]", objOptSafe.toString(), function1, valueValidator, parsingErrorLogger, typeHelper, null));
                    z5 = true;
                    logger = parsingErrorLogger;
                } else {
                    try {
                        objInvoke = function1.invoke(objOptSafe);
                    } catch (ClassCastException unused2) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i, objOptSafe));
                    } catch (Exception e3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i, objOptSafe, e3));
                    }
                    if (objInvoke != null) {
                        if (typeHelper.isTypeValid(objInvoke)) {
                            try {
                                if (valueValidator.isValid(objInvoke)) {
                                    arrayList.add(objInvoke);
                                } else {
                                    try {
                                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i, objInvoke));
                                    } catch (ClassCastException unused3) {
                                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i, objInvoke));
                                    }
                                }
                            } catch (ClassCastException unused4) {
                            }
                        } else {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i, objOptSafe));
                        }
                    }
                }
            }
        }
        if (!z5) {
            try {
                if (listValidator.isValid(arrayList)) {
                    return new ConstantExpressionList(arrayList);
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused5) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (!(obj instanceof Expression)) {
                arrayList.set(i10, Expression.constant(obj, parsingContext.getLogger()));
            }
        }
        return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
    }

    private static <T> T optSafe(JSONArray jSONArray, int i) {
        T t10 = (T) jSONArray.opt(i);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), expression);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            if (Expression.mayBeExpression(objOptSafe)) {
                return new Expression.MutableExpression(str, objOptSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, null);
            }
            try {
                Object objInvoke = function1.invoke(objOptSafe);
                if (objInvoke != null) {
                    if (typeHelper.isTypeValid(objInvoke)) {
                        try {
                            if (valueValidator.isValid(objInvoke)) {
                                return Expression.constant(objInvoke, parsingContext.getLogger());
                            }
                            throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
                        } catch (ClassCastException unused) {
                            throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                        }
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e3) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e3);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, expression);
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator, Expression<V> expression) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(objOptSafe)) {
            return new Expression.MutableExpression(str, objOptSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, expression);
        }
        try {
            Object objInvoke = function1.invoke(objOptSafe);
            if (objInvoke == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(objInvoke)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(objInvoke)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                    return null;
                }
                return Expression.constant(objInvoke, parsingContext.getLogger());
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e3) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e3));
            return null;
        }
    }
}
