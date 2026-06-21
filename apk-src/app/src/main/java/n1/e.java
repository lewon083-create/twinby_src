package n1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f28979d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28982g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f28976a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28977b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28978c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28980e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28983h = 1;
    public f i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28984j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28985k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f28986l = new ArrayList();

    public e(n nVar) {
        this.f28979d = nVar;
    }

    @Override // n1.d
    public final void a(d dVar) {
        ArrayList<e> arrayList = this.f28986l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).f28984j) {
                return;
            }
        }
        this.f28978c = true;
        n nVar = this.f28976a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f28977b) {
            this.f28979d.a(this);
            return;
        }
        e eVar = null;
        int i = 0;
        for (e eVar2 : arrayList) {
            if (!(eVar2 instanceof f)) {
                i++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i == 1 && eVar.f28984j) {
            f fVar = this.i;
            if (fVar != null) {
                if (!fVar.f28984j) {
                    return;
                } else {
                    this.f28981f = this.f28983h * fVar.f28982g;
                }
            }
            d(eVar.f28982g + this.f28981f);
        }
        n nVar2 = this.f28976a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f28985k.add(nVar);
        if (this.f28984j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f28986l.clear();
        this.f28985k.clear();
        this.f28984j = false;
        this.f28982g = 0;
        this.f28978c = false;
        this.f28977b = false;
    }

    public void d(int i) {
        if (this.f28984j) {
            return;
        }
        this.f28984j = true;
        this.f28982g = i;
        for (d dVar : this.f28985k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28979d.f29001b.h0);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.f28980e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f28984j ? Integer.valueOf(this.f28982g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f28986l.size());
        sb2.append(":d=");
        sb2.append(this.f28985k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
