package h4;

import android.util.Pair;
import j3.d0;
import java.io.IOException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f20406d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f20405c = dVar;
        this.f20403a = str;
        this.f20404b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) throws d0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e3) {
            throw d0.b(null, e3);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j10) throws d0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e3) {
            throw d0.b(null, e3);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) throws d0 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new e(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e3) {
            throw d0.b(null, e3);
        }
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.f20406d;
            if (i >= linkedList.size()) {
                d dVar = this.f20405c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z5 = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d iVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f20404b.equals(name)) {
                    j(xmlPullParser);
                    z5 = true;
                } else if (z5) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = this.f20403a;
                        if (zEquals) {
                            iVar = new g(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            iVar = new f(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            iVar = new i(this, str);
                        }
                        if (iVar == null) {
                            i = 1;
                        } else {
                            a(iVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z5 && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z5) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.f20406d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
