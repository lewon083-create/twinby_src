package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.impl.c;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
public final class SafePackageManager {
    private static Object a(Boolean bool, Function0 function0) {
        Object objInvoke;
        try {
            objInvoke = function0.invoke();
        } catch (Throwable unused) {
        }
        return objInvoke == null ? bool : objInvoke;
    }

    @Nullable
    public final ActivityInfo getActivityInfo(@NotNull Context context, @NotNull ComponentName componentName, int i) {
        return (ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i));
    }

    @Nullable
    public final ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull String str, int i) {
        return (ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i));
    }

    @Nullable
    public final Bundle getApplicationMetaData(@NotNull Context context) {
        return (Bundle) a(null, new c(this, context));
    }

    @Nullable
    public final String getInstallerPackageName(@NotNull Context context, @NotNull String str) {
        return (String) a(null, new d(context, str));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str) {
        return getPackageInfo(context, str, 0);
    }

    @Nullable
    public final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull ComponentName componentName, int i) {
        return (ServiceInfo) a(null, new f(context, componentName, i));
    }

    public final boolean hasSystemFeature(@NotNull Context context, @NotNull String str) {
        return ((Boolean) a(Boolean.FALSE, new g(context, str))).booleanValue();
    }

    @Nullable
    public final ResolveInfo resolveActivity(@NotNull Context context, @NotNull Intent intent, int i) {
        return (ResolveInfo) a(null, new h(context, intent, i));
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String str) {
        return (ProviderInfo) a(null, new i(context, str));
    }

    @Nullable
    public final ResolveInfo resolveService(@NotNull Context context, @NotNull Intent intent, int i) {
        return (ResolveInfo) a(null, new j(context, intent, i));
    }

    @Nullable
    public final Unit setComponentEnabledSetting(@NotNull Context context, @NotNull ComponentName componentName, int i, int i10) {
        return (Unit) a(null, new k(context, componentName, i, i10));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str, int i) {
        return (PackageInfo) a(null, new e(context, str, i));
    }
}
