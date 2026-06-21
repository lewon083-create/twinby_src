package m1;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l7.o;
import n1.m;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f28445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f28447f;
    public k1.e i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f28442a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28448g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28449h = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    public c(d dVar, int i) {
        this.f28445d = dVar;
        this.f28446e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, false);
    }

    public final boolean b(c cVar, int i, int i10, boolean z5) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z5 && !i(cVar)) {
            return false;
        }
        this.f28447f = cVar;
        if (cVar.f28442a == null) {
            cVar.f28442a = new HashSet();
        }
        HashSet hashSet = this.f28447f.f28442a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f28448g = i;
        this.f28449h = i10;
        return true;
    }

    public final void c(int i, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f28442a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                n1.g.b(((c) it.next()).f28445d, i, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f28444c) {
            return this.f28443b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f28445d.f28463g0 == 8) {
            return 0;
        }
        int i = this.f28449h;
        return (i == Integer.MIN_VALUE || (cVar = this.f28447f) == null || cVar.f28445d.f28463g0 != 8) ? this.f28448g : i;
    }

    public final c f() {
        int i = this.f28446e;
        int iM = z.m(i);
        d dVar = this.f28445d;
        switch (iM) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(o.x(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f28442a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f28447f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(m1.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            m1.d r1 = r11.f28445d
            int r11 = r11.f28446e
            r2 = 6
            int r3 = r10.f28446e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.E
            if (r11 == 0) goto L65
            m1.d r11 = r10.f28445d
            boolean r11 = r11.E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = t.z.m(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = l7.o.x(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof m1.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof m1.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.i(m1.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f28447f;
        if (cVar != null && (hashSet = cVar.f28442a) != null) {
            hashSet.remove(this);
            if (this.f28447f.f28442a.size() == 0) {
                this.f28447f.f28442a = null;
            }
        }
        this.f28442a = null;
        this.f28447f = null;
        this.f28448g = 0;
        this.f28449h = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f28444c = false;
        this.f28443b = 0;
    }

    public final void k() {
        k1.e eVar = this.i;
        if (eVar == null) {
            this.i = new k1.e(1);
        } else {
            eVar.c();
        }
    }

    public final void l(int i) {
        this.f28443b = i;
        this.f28444c = true;
    }

    public final String toString() {
        return this.f28445d.h0 + StringUtils.PROCESS_POSTFIX_DELIMITER + o.x(this.f28446e);
    }
}
