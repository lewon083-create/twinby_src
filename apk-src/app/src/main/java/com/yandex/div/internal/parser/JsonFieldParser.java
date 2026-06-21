package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import bg.a;
import com.google.android.gms.internal.ads.om1;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.ParsingContext;
import ij.g;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonFieldParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new a(18);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field) {
        return readField(parsingContext, jSONObject, str, z5, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull g gVar) {
        try {
            return new Field.Value(z5, JsonPropertyParser.readList(parsingContext, jSONObject, str, gVar));
        } catch (ParsingException e3) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e3);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z5, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e3;
        }
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionListField(parsingContext, jSONObject, str, typeHelper, z5, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field) {
        return readOptionalField(parsingContext, jSONObject, str, z5, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalListField(parsingContext, jSONObject, str, z5, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    public static String readReference(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, om1.k("$", str), IS_NOT_EMPTY);
    }

    public static <V> Field<V> referenceOrFallback(boolean z5, String str, Field<V> field) {
        if (str != null) {
            return new Field.Reference(z5, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        if (z5) {
            return Field.Companion.nullField(z5);
        }
        return null;
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull Function1<R, V> function1) {
        return readField(parsingContext, jSONObject, str, z5, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull Function1<R, V> function1) {
        return readOptionalField(parsingContext, jSONObject, str, z5, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull ValueValidator<V> valueValidator) {
        return readField(parsingContext, jSONObject, str, z5, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, valueValidator);
        if (optionalExpressionList != null) {
            return new Field.Value(z5, optionalExpressionList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, function1, valueValidator);
        if (optional != null) {
            return new Field.Value(z5, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, function1, listValidator, valueValidator);
        if (optionalList != null) {
            return new Field.Value(z5, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z5, JsonPropertyParser.read(parsingContext, jSONObject, str, function1, valueValidator));
        } catch (ParsingException e3) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e3);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z5, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e3;
        }
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z5, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z5, JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator));
        } catch (ParsingException e3) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e3);
            Field<Expression<V>> fieldReferenceOrFallback = referenceOrFallback(z5, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e3;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull g gVar, @NonNull ListValidator<V> listValidator) {
        try {
            return new Field.Value(z5, JsonPropertyParser.readList(parsingContext, jSONObject, str, gVar, listValidator));
        } catch (ParsingException e3) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e3);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z5, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e3;
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z5, Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
        if (optionalExpression != null) {
            return new Field.Value(z5, optionalExpression);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull g gVar) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, gVar);
        if (optional != null) {
            return new Field.Value(z5, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull g gVar) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, gVar);
        if (optionalList != null) {
            return new Field.Value(z5, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<V> field, @NonNull g gVar) {
        try {
            return new Field.Value(z5, JsonPropertyParser.read(parsingContext, jSONObject, str, gVar));
        } catch (ParsingException e3) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e3);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z5, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e3;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z5, Field<List<V>> field, @NonNull g gVar, @NonNull ListValidator<V> listValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, gVar, listValidator);
        if (optionalList != null) {
            return new Field.Value(z5, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z5, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z5);
        }
        return Field.Companion.nullField(z5);
    }
}
