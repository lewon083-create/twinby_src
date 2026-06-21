package com.yandex.div.evaluable.types;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

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
public abstract class Color {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m593parseC4zCDoM(@NotNull String colorString) {
            String str;
            Intrinsics.checkNotNullParameter(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException("Unknown color ".concat(colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char cCharAt = colorString.charAt(1);
                char cCharAt2 = colorString.charAt(2);
                char cCharAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = colorString.charAt(1);
                char cCharAt5 = colorString.charAt(2);
                char cCharAt6 = colorString.charAt(3);
                char cCharAt7 = colorString.charAt(4);
                str = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                StringBuilder sb2 = new StringBuilder("ff");
                String strSubstring = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                str = sb2.toString();
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color ".concat(colorString));
                }
                str = colorString.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            return Color.m591constructorimpl((int) Long.parseLong(str, CharsKt.checkRadix(16)));
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m592toStringimpl(int i) {
        StringBuilder sb2 = new StringBuilder("#");
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        String upperCase = StringsKt.G(8, hexString).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m591constructorimpl(int i) {
        return i;
    }
}
