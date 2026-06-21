package io.appmetrica.analytics.coreutils.internal.io;

import hl.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GZIPUtils {

    @NotNull
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    @Nullable
    public static final byte[] gzipBytes(@Nullable byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = null;
        }
    }

    @Nullable
    public static final byte[] unGzipBytes(@Nullable byte[] bArr) throws Throwable {
        Throwable th2;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
            } catch (Throwable th3) {
                byteArrayInputStream = byteArrayInputStream3;
                th2 = th3;
                gZIPInputStream = null;
            }
            try {
                byte[] bArrW = d.w(gZIPInputStream);
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                return bArrW;
            } catch (Throwable th4) {
                byteArrayInputStream = byteArrayInputStream3;
                th2 = th4;
                byteArrayInputStream2 = byteArrayInputStream;
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            gZIPInputStream = null;
        }
    }
}
