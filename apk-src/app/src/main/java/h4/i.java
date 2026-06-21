package h4;

import io.sentry.rrweb.RRWebVideoEvent;
import j3.d0;
import j3.o;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f20420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20422h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f20424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f20429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f20430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20431r;

    public i(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f20419e = str;
        this.f20420f = new LinkedList();
    }

    @Override // h4.d
    public final void a(Object obj) {
        if (obj instanceof o) {
            this.f20420f.add((o) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 h4.b, still in use, count: 2, list:
          (r3v0 h4.b) from 0x0082: MOVE (r26v0 h4.b) = (r3v0 h4.b) (LINE:131)
          (r3v0 h4.b) from 0x004e: MOVE (r26v4 h4.b) = (r3v0 h4.b) (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // h4.d
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.b():java.lang.Object");
    }

    @Override // h4.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // h4.d
    public final void j(XmlPullParser xmlPullParser) throws d0 {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new e("Type", 0);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if (RRWebVideoEvent.EVENT_TAG.equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw d0.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.f20421g = i;
            l(Integer.valueOf(i), "Type");
            if (this.f20421g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new e("Subtype", 0);
                }
                this.f20422h = attributeValue2;
            } else {
                this.f20422h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f20422h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f20423j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new e("Url", 0);
            }
            this.f20424k = attributeValue4;
            this.f20425l = d.g(xmlPullParser, "MaxWidth");
            this.f20426m = d.g(xmlPullParser, "MaxHeight");
            this.f20427n = d.g(xmlPullParser, "DisplayWidth");
            this.f20428o = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f20429p = attributeValue5;
            l(attributeValue5, "Language");
            long jG = d.g(xmlPullParser, "TimeScale");
            this.i = jG;
            if (jG == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.f20430q = new ArrayList();
            return;
        }
        int size = this.f20430q.size();
        long jH = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (jH == -9223372036854775807L) {
            if (size == 0) {
                jH = 0;
            } else {
                if (this.f20431r == -1) {
                    throw d0.b("Unable to infer start time", null);
                }
                jH = this.f20431r + ((Long) this.f20430q.get(size - 1)).longValue();
            }
        }
        this.f20430q.add(Long.valueOf(jH));
        this.f20431r = d.h(xmlPullParser, "d", -9223372036854775807L);
        long jH2 = d.h(xmlPullParser, "r", 1L);
        if (jH2 > 1 && this.f20431r == -9223372036854775807L) {
            throw d0.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j10 = i;
            if (j10 >= jH2) {
                return;
            }
            this.f20430q.add(Long.valueOf((this.f20431r * j10) + jH));
            i++;
        }
    }
}
