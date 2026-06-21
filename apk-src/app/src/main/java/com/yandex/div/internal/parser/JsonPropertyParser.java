package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import ij.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonPropertyParser {
    private static JSONObject nullable(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t10 = (T) jSONObject.opt(str);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i));
            if (jSONObjectNullable != null) {
                try {
                    Object objDeserialize = ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectNullable);
                    if (objDeserialize != null) {
                        arrayList.add(objDeserialize);
                    }
                } catch (Exception e3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i, e3));
                }
            }
        }
        return arrayList;
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            return (String) objOptSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e3) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e3));
            return null;
        }
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (String) objOptSafe;
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
        } catch (Exception e3) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e3);
        }
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) read(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) readOptional(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (listValidator.isValid(list)) {
                        return list;
                    }
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object objOptSafe = optSafe(jSONArrayOptJSONArray, i);
                if (objOptSafe != null) {
                    try {
                        Object objInvoke = function1.invoke(objOptSafe);
                        if (objInvoke != null) {
                            try {
                                if (valueValidator.isValid(objInvoke)) {
                                    arrayList.add(objInvoke);
                                } else {
                                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i, objInvoke));
                                }
                            } catch (ClassCastException unused2) {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i, objInvoke));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i, objOptSafe));
                    } catch (Exception e3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i, objOptSafe, e3));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            } catch (ClassCastException unused4) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    private static <T> T optSafe(JSONArray jSONArray, int i) {
        T t10 = (T) jSONArray.opt(i);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            try {
                V v5 = (V) function1.invoke(objOptSafe);
                if (v5 != null) {
                    try {
                        if (valueValidator.isValid(v5)) {
                            return v5;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, v5);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, v5);
                    }
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

    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            V v5 = (V) function1.invoke(objOptSafe);
            if (v5 == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v5)) {
                    return v5;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
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

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i));
                if (jSONObjectNullable != null) {
                    try {
                        Object objDeserialize = ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectNullable);
                        if (objDeserialize != null) {
                            arrayList.add(objDeserialize);
                        }
                    } catch (Exception e3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i, e3));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return (V) ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectOptJSONObject);
        } catch (Exception e3) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e3));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            try {
                V v5 = (V) ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectOptJSONObject);
                if (v5 != null) {
                    return v5;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, null);
            } catch (Exception e3) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e3);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i));
            if (jSONObjectNullable != null) {
                try {
                    Object objDeserialize = ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectNullable);
                    if (objDeserialize != null) {
                        arrayList.add(objDeserialize);
                    }
                } catch (Exception e3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i, e3));
                }
            }
        }
        return arrayList;
    }

    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g gVar, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (listValidator.isValid(list)) {
                        return list;
                    }
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i));
                if (jSONObjectNullable != null) {
                    try {
                        Object objDeserialize = ((Deserializer) gVar.getValue()).deserialize(parsingContext, jSONObjectNullable);
                        if (objDeserialize != null) {
                            arrayList.add(objDeserialize);
                        }
                    } catch (Exception e3) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i, e3));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            } catch (ClassCastException unused2) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }
}
