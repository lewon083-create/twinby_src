package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0112dj implements SdkEnvironmentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb f23700b = new Jb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f23701c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SdkEnvironment f23702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23703e;

    public C0112dj(@NotNull Context context) {
        this.f23699a = context;
        this.f23702d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.14.2", "50157683", AbstractC0137ej.a()), "phone", Jb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(@Nullable ScreenInfo screenInfo) {
        float f10;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f23703e;
                    if (str == null) {
                        Context context = this.f23699a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = O7.f22774a;
                        try {
                            f10 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f10 = 0.0f;
                        }
                        if (Float.isNaN(f10) || f10 == 0.0f) {
                            str = "phone";
                        } else {
                            int i = point.x;
                            int i10 = point.y;
                            if (O7.a(context)) {
                                str = "tv";
                            } else {
                                float f11 = 160 * f10;
                                float f12 = i;
                                float f13 = f12 / f11;
                                float f14 = i10;
                                float f15 = f14 / f11;
                                double dSqrt = Math.sqrt((f15 * f15) + (f13 * f13));
                                float f16 = f12 / f10;
                                float f17 = f14 / f10;
                                if (f16 > f17) {
                                    f16 = f17;
                                }
                                str = (dSqrt >= ((double) 7) || f16 >= ((float) VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION)) ? "tablet" : "phone";
                            }
                        }
                    }
                    this.f23702d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f23701c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0402p5) ((InterfaceC0086cj) it.next())).d();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NotNull InterfaceC0086cj interfaceC0086cj) {
        this.f23701c.remove(interfaceC0086cj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f23702d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        Intrinsics.g("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(@Nullable String str) {
        if (str != null) {
            if (!str.equals(this.f23703e)) {
                this.f23703e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f23702d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f23701c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0402p5) ((InterfaceC0086cj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!Intrinsics.a(appVersionInfo.getAppVersionName(), str) || !Intrinsics.a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f23702d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f23701c.iterator();
            while (it.hasNext()) {
                ((AbstractC0402p5) ((InterfaceC0086cj) it.next())).d();
            }
        }
    }

    public final synchronized void a(@NotNull Configuration configuration) {
        this.f23700b.getClass();
        List listA = Jb.a(configuration);
        if (!Intrinsics.a(getSdkEnvironment().getLocales(), listA)) {
            this.f23702d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f23701c.iterator();
            while (it.hasNext()) {
                ((AbstractC0402p5) ((InterfaceC0086cj) it.next())).d();
            }
        }
    }

    public final void a(@NotNull InterfaceC0086cj interfaceC0086cj) {
        this.f23701c.add(interfaceC0086cj);
    }
}
