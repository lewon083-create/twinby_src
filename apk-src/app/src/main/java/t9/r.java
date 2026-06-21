package t9;

import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.pn1;
import com.google.android.gms.internal.ads.qa;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends qa {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f33646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte[] f33647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Map f33648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u9.f f33649r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, int i, String str, s sVar, r3.b bVar, byte[] bArr, Map map, u9.f fVar) {
        super(i, str, bVar);
        this.f33647p = bArr;
        this.f33648q = map;
        this.f33649r = fVar;
        this.f33645n = new Object();
        this.f33646o = sVar;
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final Map e() {
        Map map = this.f33648q;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final byte[] f() {
        byte[] bArr = this.f33647p;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final b7 h(oa oaVar) {
        String str;
        String str2;
        byte[] bArr = oaVar.f8645b;
        try {
            Map map = oaVar.f8646c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new b7(str, pn1.d(oaVar));
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void i(Object obj) {
        s sVar;
        String str = (String) obj;
        u9.f fVar = this.f33649r;
        if (u9.f.c() && str != null) {
            fVar.e("onNetworkResponseBody", new m4.d(str.getBytes()));
        }
        synchronized (this.f33645n) {
            sVar = this.f33646o;
        }
        sVar.b(str);
    }
}
