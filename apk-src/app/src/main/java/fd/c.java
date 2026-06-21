package fd;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import md.q;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements yd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16751c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f16749a = i;
        this.f16750b = obj;
        this.f16751c = obj2;
    }

    @Override // yd.a
    public final Object get() {
        switch (this.f16749a) {
            case 0:
                g gVar = (g) this.f16750b;
                return new de.a((Context) this.f16751c, gVar.g(), (vd.c) gVar.f16761d.a(vd.c.class));
            case 1:
                md.f fVar = (md.f) this.f16750b;
                md.b bVar = (md.b) this.f16751c;
                md.e eVar = bVar.f28836f;
                o oVar = new o();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<md.i> set = bVar.f28833c;
                Set set2 = bVar.f28837g;
                for (md.i iVar : set) {
                    int i = iVar.f28855c;
                    int i10 = iVar.f28854b;
                    boolean z5 = i == 0;
                    q qVar = iVar.f28853a;
                    if (z5) {
                        if (i10 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i == 2) {
                        hashSet3.add(qVar);
                    } else if (i10 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(q.a(vd.c.class));
                }
                oVar.f31946a = Collections.unmodifiableSet(hashSet);
                oVar.f31947b = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                oVar.f31948c = Collections.unmodifiableSet(hashSet4);
                oVar.f31949d = Collections.unmodifiableSet(hashSet5);
                oVar.f31950e = set2;
                oVar.f31951f = fVar;
                return eVar.l(oVar);
            default:
                return new wd.i((Context) this.f16751c, (String) this.f16750b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f16749a = 2;
        this.f16751c = context;
        this.f16750b = str;
    }
}
