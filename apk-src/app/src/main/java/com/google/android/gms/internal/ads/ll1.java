package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ll1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ll1 f7570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ll1 f7571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ll1 f7572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ll1[] f7573e;

    /* JADX INFO: Fake field, exist only in values array */
    ll1 EF0;

    static {
        ll1 ll1Var = new ll1("SHA1", 0);
        ll1 ll1Var2 = new ll1("SHA224", 1);
        ll1 ll1Var3 = new ll1("SHA256", 2);
        f7570b = ll1Var3;
        ll1 ll1Var4 = new ll1("SHA384", 3);
        f7571c = ll1Var4;
        ll1 ll1Var5 = new ll1("SHA512", 4);
        f7572d = ll1Var5;
        f7573e = new ll1[]{ll1Var, ll1Var2, ll1Var3, ll1Var4, ll1Var5};
    }

    public static ll1[] values() {
        return (ll1[]) f7573e.clone();
    }
}
