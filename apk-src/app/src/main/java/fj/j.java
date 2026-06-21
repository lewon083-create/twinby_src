package fj;

import fh.nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd f19358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f19359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f19360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f19361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f19362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f19363h;
    public static final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ j[] f19364j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19365b;

    static {
        j jVar = new j("DEBUG", 0, 0);
        f19359d = jVar;
        j jVar2 = new j("ERROR", 1, 1);
        f19360e = jVar2;
        j jVar3 = new j("LOG", 2, 2);
        f19361f = jVar3;
        j jVar4 = new j("TIP", 3, 3);
        f19362g = jVar4;
        j jVar5 = new j("WARNING", 4, 4);
        f19363h = jVar5;
        j jVar6 = new j("UNKNOWN", 5, 5);
        i = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        f19364j = jVarArr;
        hl.d.k(jVarArr);
        f19358c = new nd();
    }

    public j(String str, int i10, int i11) {
        this.f19365b = i11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f19364j.clone();
    }
}
