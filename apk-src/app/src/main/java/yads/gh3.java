package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh3 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f38764a;

    public /* synthetic */ gh3() {
        this(new up3());
    }

    @Override // yads.tp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final fh3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f38764a.getClass();
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f38764a.getClass();
            if (xmlPullParser.next() == 3) {
                return new fh3(str, arrayList);
            }
            this.f38764a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    this.f38764a.getClass();
                    String strA = up3.a(xmlPullParser);
                    if (strA.length() > 0) {
                        str = strA;
                    }
                } else if ("ClickTracking".equals(name)) {
                    this.f38764a.getClass();
                    String strA2 = up3.a(xmlPullParser);
                    if (strA2.length() > 0) {
                        arrayList.add(strA2);
                    }
                } else {
                    this.f38764a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public gh3(up3 up3Var) {
        this.f38764a = up3Var;
    }
}
