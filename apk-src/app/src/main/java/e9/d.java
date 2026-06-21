package e9;

import j3.h0;
import j3.i0;
import m3.k;
import y8.j;
import yads.af;
import yads.ao0;
import yads.oe2;
import yads.of1;
import yads.pe2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements g9.b, k, k0.a, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16307e;

    public /* synthetic */ d(int i, Object obj, Object obj2, int i10) {
        this.f16304b = i10;
        this.f16305c = i;
        this.f16306d = obj;
        this.f16307e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    @Override // k0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ed.d apply(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.d.apply(java.lang.Object):ed.d");
    }

    @Override // g9.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f16306d;
        ((ka.k) cVar.f13340d).R((j) this.f16307e, this.f16305c + 1, false);
        return null;
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f16304b) {
            case 1:
                i0 i0Var = (i0) this.f16306d;
                i0 i0Var2 = (i0) this.f16307e;
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                h0Var.o(i0Var, i0Var2, this.f16305c);
                break;
            case 2:
            default:
                int i = this.f16305c;
                ((af) obj).getClass();
                break;
            case 3:
                ao0.a(this.f16305c, (pe2) this.f16306d, (pe2) this.f16307e, (oe2) obj);
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i, int i10) {
        this.f16304b = i10;
        this.f16306d = obj;
        this.f16307e = obj2;
        this.f16305c = i;
    }
}
