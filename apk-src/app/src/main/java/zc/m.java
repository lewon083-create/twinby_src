package zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f46225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f46226c;

    static {
        i iVar = new i();
        f46225b = iVar;
        f46226c = new m[]{iVar, new m() { // from class: zc.j
            @Override // zc.g
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new m() { // from class: zc.k
            @Override // zc.g
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new m() { // from class: zc.l
            @Override // zc.g
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f46226c.clone();
    }
}
