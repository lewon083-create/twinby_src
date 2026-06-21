package u3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends k3.l {
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f34206j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    @Override // k3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.u.b(java.nio.ByteBuffer):void");
    }

    @Override // k3.l
    public final k3.h f(k3.h hVar) throws k3.j {
        int i = hVar.f26862c;
        int[] iArr = this.i;
        if (iArr == null) {
            return k3.h.f26859e;
        }
        int i10 = hVar.f26861b;
        if (!m3.z.H(i)) {
            throw new k3.j(hVar);
        }
        boolean z5 = i10 != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new k3.j("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", hVar);
            }
            z5 |= i12 != i11;
            i11++;
        }
        return z5 ? new k3.h(hVar.f26860a, iArr.length, i) : k3.h.f26859e;
    }

    @Override // k3.l
    public final void g() {
        this.f34206j = this.i;
    }

    @Override // k3.l
    public final void i() {
        this.f34206j = null;
        this.i = null;
    }
}
