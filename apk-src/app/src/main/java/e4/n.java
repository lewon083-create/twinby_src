package e4;

import a0.b1;
import ad.k0;
import ad.m0;
import com.google.android.gms.internal.measurement.j4;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f16165a;

    static {
        new n(new b1(9));
    }

    public n(b1 b1Var) {
        k0 k0Var;
        ad.v vVar = (ad.v) ((a7.l) b1Var.f45c).f491c;
        if (vVar == null) {
            k0Var = ad.b0.f767f;
        } else {
            Collection collectionEntrySet = vVar.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                k0Var = ad.b0.f767f;
            } else {
                ad.s<Map.Entry> sVar = (ad.s) collectionEntrySet;
                m0 m0Var = new m0(sVar.f864c.size(), 0);
                int i = 0;
                for (Map.Entry entry : sVar) {
                    Object key = entry.getKey();
                    ad.b1 b1VarG = ((ad.g0) entry.getValue()).g();
                    m0Var.n(key, b1VarG);
                    i += b1VarG.f770e;
                }
                k0Var = new k0(m0Var.d(true), i);
            }
        }
        this.f16165a = k0Var;
    }

    public static String a(String str) {
        return j4.n(str, "Accept") ? "Accept" : j4.n(str, "Allow") ? "Allow" : j4.n(str, "Authorization") ? "Authorization" : j4.n(str, "Bandwidth") ? "Bandwidth" : j4.n(str, "Blocksize") ? "Blocksize" : j4.n(str, "Cache-Control") ? "Cache-Control" : j4.n(str, "Connection") ? "Connection" : j4.n(str, "Content-Base") ? "Content-Base" : j4.n(str, "Content-Encoding") ? "Content-Encoding" : j4.n(str, "Content-Language") ? "Content-Language" : j4.n(str, "Content-Length") ? "Content-Length" : j4.n(str, "Content-Location") ? "Content-Location" : j4.n(str, "Content-Type") ? "Content-Type" : j4.n(str, "CSeq") ? "CSeq" : j4.n(str, "Date") ? "Date" : j4.n(str, "Expires") ? "Expires" : j4.n(str, "Location") ? "Location" : j4.n(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : j4.n(str, "Proxy-Require") ? "Proxy-Require" : j4.n(str, "Public") ? "Public" : j4.n(str, "Range") ? "Range" : j4.n(str, "RTP-Info") ? "RTP-Info" : j4.n(str, "RTCP-Interval") ? "RTCP-Interval" : j4.n(str, "Scale") ? "Scale" : j4.n(str, "Session") ? "Session" : j4.n(str, "Speed") ? "Speed" : j4.n(str, "Supported") ? "Supported" : j4.n(str, "Timestamp") ? "Timestamp" : j4.n(str, "Transport") ? "Transport" : j4.n(str, "User-Agent") ? "User-Agent" : j4.n(str, "Via") ? "Via" : j4.n(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        ad.j0 j0VarG = this.f16165a.g(a(str));
        if (j0VarG.isEmpty()) {
            return null;
        }
        return (String) ad.q.j(j0VarG);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f16165a.equals(((n) obj).f16165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16165a.hashCode();
    }
}
