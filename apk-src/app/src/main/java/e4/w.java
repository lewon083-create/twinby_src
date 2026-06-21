package e4;

import android.net.Uri;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f16211b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0591, code lost:
    
        if (r2.equals("audio/amr-wb") != false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(e4.n r39, e4.b r40, android.net.Uri r41) {
        /*
            Method dump skipped, instruction units count: 1992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.w.<init>(e4.n, e4.b, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(n3.n.f29087a, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f16210a.equals(wVar.f16210a) && this.f16211b.equals(wVar.f16211b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16211b.hashCode() + ((this.f16210a.hashCode() + 217) * 31);
    }
}
