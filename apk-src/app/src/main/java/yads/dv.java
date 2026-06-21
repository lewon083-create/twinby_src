package yads;

import io.sentry.protocol.Browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cv f37889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dv f37890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dv[] f37891e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37892b;

    static {
        dv dvVar = new dv(0, "BROWSER", Browser.TYPE);
        dv dvVar2 = new dv(1, "WEBVIEW", "webview");
        f37890d = dvVar2;
        dv[] dvVarArr = {dvVar, dvVar2};
        f37891e = dvVarArr;
        hl.d.k(dvVarArr);
        f37889c = new cv();
    }

    public dv(int i, String str, String str2) {
        this.f37892b = str2;
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) f37891e.clone();
    }
}
