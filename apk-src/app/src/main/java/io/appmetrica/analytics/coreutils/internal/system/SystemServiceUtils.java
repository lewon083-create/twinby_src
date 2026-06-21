package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
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
public final class SystemServiceUtils {

    @NotNull
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    @Nullable
    public static final <T, S> S accessSystemServiceByNameSafely(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, S s10, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s10, functionWithThrowable);
        } catch (Throwable unused) {
            return s10;
        }
    }

    @Nullable
    public static final <T, S> S accessSystemServiceSafely(@Nullable T t10, @NotNull String str, @NotNull String str2, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t10 == null) {
            return null;
        }
        try {
            return functionWithThrowable.mo625apply(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(@Nullable T t10, @NotNull String str, @NotNull String str2, S s10, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        S s11 = (S) accessSystemServiceSafely(t10, str, str2, functionWithThrowable);
        return s11 == null ? s10 : s11;
    }
}
