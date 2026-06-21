package td;

import java.util.Date;
import java.util.HashMap;
import rd.f;
import rd.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements sd.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f33769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f33770g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f33772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f33773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f33774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33768e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f33771h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [td.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [td.b] */
    static {
        final int i = 0;
        f33769f = new f() { // from class: td.b
            @Override // rd.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f33770g = new f() { // from class: td.b
            @Override // rd.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f33772a = map;
        HashMap map2 = new HashMap();
        this.f33773b = map2;
        this.f33774c = f33768e;
        this.f33775d = false;
        map2.put(String.class, f33769f);
        map.remove(String.class);
        map2.put(Boolean.class, f33770g);
        map.remove(Boolean.class);
        map2.put(Date.class, f33771h);
        map.remove(Date.class);
    }

    public final sd.a a(Class cls, rd.d dVar) {
        this.f33772a.put(cls, dVar);
        this.f33773b.remove(cls);
        return this;
    }
}
