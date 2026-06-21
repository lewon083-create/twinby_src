package com.yandex.div.json.expressions;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public abstract class Expression<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Expression constant$default(Companion companion, Object obj, ParsingErrorLogger parsingErrorLogger, int i, Object obj2) {
            if ((i & 2) != 0) {
                parsingErrorLogger = ParsingErrorLogger.LOG;
            }
            return companion.constant(obj, parsingErrorLogger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Expression<T> constant(@NotNull T t10, @NotNull ParsingErrorLogger parsingErrorLogger) {
            if (!(t10 instanceof String)) {
                return new ConstantExpression(t10);
            }
            return new StringConstantExpression((String) t10, null, parsingErrorLogger, 2, null);
        }

        public final boolean mayBeExpression(@Nullable Object obj) {
            return (obj instanceof String) && StringsKt.y((CharSequence) obj, "@{", false);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class ConstantExpression<T> extends Expression<T> {

        @NotNull
        private final T value;

        public ConstantExpression(@NotNull T t10) {
            this.value = t10;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Object getRawValue() {
            T t10 = this.value;
            Intrinsics.c(t10, "null cannot be cast to non-null type kotlin.Any");
            return t10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class MutableExpression<R, T> extends Expression<T> {

        @Nullable
        private final Function1<R, T> converter;

        @NotNull
        private final String expressionKey;

        @Nullable
        private final Expression<T> fieldDefaultValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String rawValue;

        @NotNull
        private final TypeHelper<T> typeHelper;

        @NotNull
        private final ValueValidator<T> validator;

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(@NotNull String str, @NotNull String str2, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull TypeHelper<T> typeHelper, @Nullable Expression<T> expression) {
            this.expressionKey = str;
            this.rawExpression = str2;
            this.converter = function1;
            this.validator = valueValidator;
            this.logger = parsingErrorLogger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = str2;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public String getRawValue() {
            return this.rawValue;
        }
    }

    @NotNull
    public static final <T> Expression<T> constant(@NotNull T t10, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return Companion.constant(t10, parsingErrorLogger);
    }

    public static final boolean mayBeExpression(@Nullable Object obj) {
        return Companion.mayBeExpression(obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Expression) {
            return Intrinsics.a(getRawValue(), ((Expression) obj).getRawValue());
        }
        return false;
    }

    @NotNull
    public abstract Object getRawValue();

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class StringConstantExpression extends ConstantExpression<String> {

        @NotNull
        private final String defaultValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String value;

        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger);
        }

        public StringConstantExpression(@NotNull String str, @NotNull String str2, @NotNull ParsingErrorLogger parsingErrorLogger) {
            super(str);
            this.value = str;
            this.defaultValue = str2;
            this.logger = parsingErrorLogger;
        }
    }
}
