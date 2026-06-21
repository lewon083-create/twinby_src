package yads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f37313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b83 f37314b;

    public /* synthetic */ c83() {
        this(new up3(), new b83());
    }

    public final HashMap a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f37313a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            this.f37313a.getClass();
            if (xmlPullParser.next() == 3) {
                return map;
            }
            this.f37313a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    a83 a83VarA = this.f37314b.a(xmlPullParser);
                    if (a83VarA != null) {
                        String str = a83VarA.f36649a;
                        String str2 = a83VarA.f36650b;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        List list = (List) map.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.f37313a.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public c83(up3 up3Var, b83 b83Var) {
        this.f37313a = up3Var;
        this.f37314b = b83Var;
    }
}
