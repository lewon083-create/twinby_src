package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sp3 implements tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp3 f43045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up3 f43048d;

    public /* synthetic */ sp3(tp3 tp3Var, String str, String str2) {
        this(tp3Var, str, str2, new up3());
    }

    @Override // yads.tp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        up3 up3Var = this.f43048d;
        String str = this.f43046b;
        up3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f43048d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f43048d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.a(this.f43047c, xmlPullParser.getName())) {
                    Object objA = this.f43045a.a(xmlPullParser, knVar);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } else {
                    this.f43048d.getClass();
                    up3.b(xmlPullParser);
                }
            }
        }
    }

    public sp3(tp3 tp3Var, String str, String str2, up3 up3Var) {
        this.f43045a = tp3Var;
        this.f43046b = str;
        this.f43047c = str2;
        this.f43048d = up3Var;
    }
}
