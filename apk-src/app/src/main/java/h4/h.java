package h4;

import com.google.android.gms.internal.measurement.h5;
import j3.d0;
import j3.k;
import j3.l;
import j3.n;
import j3.o;
import java.math.RoundingMode;
import java.util.LinkedList;
import m3.z;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList f20411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20414h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f20418m;

    public h(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f20416k = -1;
        this.f20418m = null;
        this.f20411e = new LinkedList();
    }

    @Override // h4.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f20411e.add((b) obj);
        } else if (obj instanceof a) {
            h5.r(this.f20418m == null);
            this.f20418m = (a) obj;
        }
    }

    @Override // h4.d
    public final Object b() {
        a aVar;
        long jU;
        LinkedList linkedList = this.f20411e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar2 = this.f20418m;
        if (aVar2 != null) {
            l lVar = new l(new k(aVar2.f20377a, null, "video/mp4", aVar2.f20378b));
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int i10 = bVar.f20380a;
                if (i10 == 2 || i10 == 1) {
                    o[] oVarArr = bVar.f20388j;
                    for (int i11 = 0; i11 < oVarArr.length; i11++) {
                        n nVarA = oVarArr[i11].a();
                        nVarA.f26296q = lVar;
                        oVarArr[i11] = new o(nVarA);
                    }
                }
            }
        }
        int i12 = this.f20412f;
        int i13 = this.f20413g;
        long j10 = this.f20414h;
        long j11 = this.i;
        long j12 = this.f20415j;
        int i14 = this.f20416k;
        boolean z5 = this.f20417l;
        a aVar3 = this.f20418m;
        long jU2 = -9223372036854775807L;
        if (j11 == 0) {
            aVar = aVar3;
            jU = -9223372036854775807L;
        } else {
            String str = z.f28608a;
            aVar = aVar3;
            jU = z.U(j11, 1000000L, j10, RoundingMode.DOWN);
        }
        if (j12 != 0) {
            String str2 = z.f28608a;
            jU2 = z.U(j12, 1000000L, j10, RoundingMode.DOWN);
        }
        return new c(i12, i13, jU, jU2, i14, z5, aVar, bVarArr);
    }

    @Override // h4.d
    public final void j(XmlPullParser xmlPullParser) throws d0 {
        this.f20412f = d.i(xmlPullParser, "MajorVersion");
        this.f20413g = d.i(xmlPullParser, "MinorVersion");
        this.f20414h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new e("Duration", 0);
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.f20415j = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.f20416k = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f20417l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f20414h), "TimeScale");
        } catch (NumberFormatException e3) {
            throw d0.b(null, e3);
        }
    }
}
