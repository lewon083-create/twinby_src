package y4;

import ad.b1;
import ad.g0;
import ad.j0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f36455a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f36456b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f36457c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.identifier.c a(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.c.a(java.lang.String):com.google.android.gms.ads.identifier.c");
    }

    public static b1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        g0 g0VarQ = j0.q();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (m3.b.m(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strH = m3.b.h(xmlPullParser, strConcat3);
                String strH2 = m3.b.h(xmlPullParser, strConcat4);
                String strH3 = m3.b.h(xmlPullParser, strConcat5);
                String strH4 = m3.b.h(xmlPullParser, strConcat6);
                if (strH == null || strH2 == null) {
                    return b1.f768f;
                }
                g0VarQ.b(new b(strH, strH3 != null ? Long.parseLong(strH3) : 0L, strH4 != null ? Long.parseLong(strH4) : 0L));
            }
        } while (!m3.b.k(xmlPullParser, strConcat2));
        return g0VarQ.g();
    }
}
