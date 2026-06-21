package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i31 implements g31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i31 f6357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i31[] f6358c;

    static {
        i31 i31Var = new i31("ALWAYS_TRUE", 0);
        f6357b = i31Var;
        f6358c = new i31[]{i31Var, new i31("ALWAYS_FALSE", 1), new i31("IS_NULL", 2), new i31("NOT_NULL", 3)};
    }

    public static i31[] values() {
        return (i31[]) f6358c.clone();
    }

    @Override // com.google.android.gms.internal.ads.g31
    public final /* synthetic */ boolean a(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
