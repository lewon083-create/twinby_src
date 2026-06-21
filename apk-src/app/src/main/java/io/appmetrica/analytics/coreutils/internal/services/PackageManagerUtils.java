package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
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
public final class PackageManagerUtils {

    @NotNull
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f21822a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(@NotNull Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @NotNull
    public static final String getAppVersionCodeString(@NotNull Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? "0.0" : str;
    }

    @Nullable
    public static final PackageInfo getPackageInfo(@NotNull Context context) {
        return f21822a.getPackageInfo(context, context.getPackageName());
    }

    @Nullable
    public static final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull Class<?> cls) {
        return f21822a.getServiceInfo(context, new ComponentName(context, cls), 4);
    }

    public static final boolean hasContentProvider(@NotNull Context context, @NotNull String str) {
        return resolveContentProvider(context, str) != null;
    }

    @Nullable
    public static final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return f21822a.resolveContentProvider(context, str);
    }
}
