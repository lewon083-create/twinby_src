package com.yandex.div.json;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import l7.o;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import pe.a;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public abstract class ParsingExceptionKt {

    @NotNull
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingException parsingException) {
        Intrinsics.c(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, om1.n(new StringBuilder("Value '"), trimLength(t10), "' for key '", str, "' is not valid"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, a.f("Value for key '", str, "' is missing"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException templateNotFound(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, a.f("Template '", str, "' is missing!"), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    private static final String trimLength(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (strValueOf.length() <= 100) {
            return strValueOf;
        }
        return e0.x(97, strValueOf) + "...";
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder sbP = om1.p("Value for key '", str, "' has wrong type ");
        sbP.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, sbP.toString(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, a.f("Value for key '", str, "' is failed to create"), exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t10, @NotNull Throwable th2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, om1.n(new StringBuilder("Value '"), trimLength(t10), "' for key '", str, "' is not valid"), th2, new JsonObject(jSONObject), null, 16, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONArray jSONArray, @NotNull String str, int i, @NotNull Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder sbI = a.i(i, "Value at ", " position of '", str, "' has wrong type ");
        sbI.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, sbI.toString(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray jSONArray, @NotNull String str, int i, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i + " position of '" + str + "' is failed to create", exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i, T t10, @NotNull Throwable th2) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb2 = new StringBuilder("Value '");
        o.p(i, trimLength(t10), "' at ", " position of '", sb2);
        return new ParsingException(parsingExceptionReason, u.o(sb2, str, "' is not valid"), th2, new JsonArray(jSONArray), null, 16, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i, T t10) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb2 = new StringBuilder("Value '");
        o.p(i, trimLength(t10), "' at ", " position of '", sb2);
        return new ParsingException(parsingExceptionReason, u.o(sb2, str, "' is not valid"), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }
}
