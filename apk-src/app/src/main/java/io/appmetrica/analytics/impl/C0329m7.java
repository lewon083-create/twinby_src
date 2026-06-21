package io.appmetrica.analytics.impl;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0329m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24348h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f24350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f24351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f24352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f24353n;

    public C0329m7(C0181gb c0181gb) {
        this.f24341a = c0181gb.b("dId");
        this.f24342b = c0181gb.b("uId");
        this.f24343c = c0181gb.b("analyticsSdkVersionName");
        this.f24344d = c0181gb.b("kitBuildNumber");
        this.f24345e = c0181gb.b("kitBuildType");
        this.f24346f = c0181gb.b("appVer");
        this.f24347g = c0181gb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f24348h = c0181gb.b("appBuild");
        this.i = c0181gb.b("osVer");
        this.f24350k = c0181gb.b(VKApiCodes.PARAM_LANG);
        this.f24351l = c0181gb.b("root");
        this.f24352m = c0181gb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c0181gb.optInt("osApiLev", -1);
        this.f24349j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c0181gb.optInt("attribution_id", 0);
        this.f24353n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb2.append(this.f24341a);
        sb2.append("', uuid='");
        sb2.append(this.f24342b);
        sb2.append("', analyticsSdkVersionName='");
        sb2.append(this.f24343c);
        sb2.append("', kitBuildNumber='");
        sb2.append(this.f24344d);
        sb2.append("', kitBuildType='");
        sb2.append(this.f24345e);
        sb2.append("', appVersion='");
        sb2.append(this.f24346f);
        sb2.append("', appDebuggable='");
        sb2.append(this.f24347g);
        sb2.append("', appBuildNumber='");
        sb2.append(this.f24348h);
        sb2.append("', osVersion='");
        sb2.append(this.i);
        sb2.append("', osApiLevel='");
        sb2.append(this.f24349j);
        sb2.append("', locale='");
        sb2.append(this.f24350k);
        sb2.append("', deviceRootStatus='");
        sb2.append(this.f24351l);
        sb2.append("', appFramework='");
        sb2.append(this.f24352m);
        sb2.append("', attributionId='");
        return a0.u.o(sb2, this.f24353n, "'}");
    }

    public C0329m7() {
        this.f24341a = null;
        this.f24342b = null;
        this.f24343c = null;
        this.f24344d = null;
        this.f24345e = null;
        this.f24346f = null;
        this.f24347g = null;
        this.f24348h = null;
        this.i = null;
        this.f24349j = null;
        this.f24350k = null;
        this.f24351l = null;
        this.f24352m = null;
        this.f24353n = null;
    }
}
