package com.yandex.div.internal;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class ComparisonFailure extends AssertionError {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actual;

    @NotNull
    private final String expected;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class ComparisonCompactor {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final String actual;
        private final int contextLength;

        @Nullable
        private final String expected;
        private int prefix;
        private int suffix;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public ComparisonCompactor(int i, @Nullable String str, @Nullable String str2) {
            this.contextLength = i;
            this.expected = str;
            this.actual = str2;
        }

        private final boolean areStringsEqual() {
            return Intrinsics.a(this.expected, this.actual);
        }

        private final String compactString(String str) {
            StringBuilder sb2 = new StringBuilder("[");
            String strSubstring = str.substring(this.prefix, (str.length() - this.suffix) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(']');
            String string = sb2.toString();
            if (this.prefix > 0) {
                string = u.o(new StringBuilder(), computeCommonPrefix(), string);
            }
            if (this.suffix <= 0) {
                return string;
            }
            StringBuilder sbJ = a.j(string);
            sbJ.append(computeCommonSuffix());
            return sbJ.toString();
        }

        private final String computeCommonPrefix() {
            StringBuilder sbJ = a.j(this.prefix > this.contextLength ? "..." : "");
            String str = this.expected;
            Intrinsics.b(str);
            String strSubstring = str.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sbJ.append(strSubstring);
            return sbJ.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            Intrinsics.b(str);
            int iMin = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? "..." : "";
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.expected;
            String strSubstring = str3.substring((str3.length() - this.suffix) + 1, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(str2);
            return sb2.toString();
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            Intrinsics.b(str);
            int length = str.length();
            String str2 = this.actual;
            Intrinsics.b(str2);
            int iMin = Math.min(length, str2.length());
            while (true) {
                int i = this.prefix;
                if (i >= iMin || this.expected.charAt(i) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            Intrinsics.b(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            Intrinsics.b(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i = this.prefix;
                if (length2 < i || length < i || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        @NotNull
        public final String compact(@Nullable String str) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(str, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(str, compactString(this.expected), compactString(this.actual));
        }
    }

    public ComparisonFailure(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }
}
