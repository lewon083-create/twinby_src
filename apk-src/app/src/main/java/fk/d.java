package fk;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f19473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f19475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f19476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f19477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f19478h;
    public static final /* synthetic */ d[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f19479b;

    static {
        d dVar = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f19473c = dVar;
        d dVar2 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        d dVar3 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f19474d = dVar3;
        d dVar4 = new d("SECONDS", 3, TimeUnit.SECONDS);
        f19475e = dVar4;
        d dVar5 = new d("MINUTES", 4, TimeUnit.MINUTES);
        f19476f = dVar5;
        d dVar6 = new d("HOURS", 5, TimeUnit.HOURS);
        f19477g = dVar6;
        d dVar7 = new d("DAYS", 6, TimeUnit.DAYS);
        f19478h = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        i = dVarArr;
        hl.d.k(dVarArr);
    }

    public d(String str, int i10, TimeUnit timeUnit) {
        this.f19479b = timeUnit;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }
}
