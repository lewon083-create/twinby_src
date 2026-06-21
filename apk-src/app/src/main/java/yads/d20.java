package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d20 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp3 f37594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up3 f37595b;

    public d20(kr0 kr0Var, up3 up3Var) {
        this.f37594a = kr0Var;
        this.f37595b = up3Var;
    }

    @Override // yads.tp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f37595b.getClass();
        Object objA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f37595b.getClass();
            if (xmlPullParser.next() == 3) {
                return objA;
            }
            this.f37595b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                objA = this.f37594a.a(xmlPullParser, knVar);
            }
        }
    }
}
