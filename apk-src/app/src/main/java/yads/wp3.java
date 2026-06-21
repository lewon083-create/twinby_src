package yads;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f44449a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f44450b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f44451c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static um2 a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        o51 o51Var = r51.f42498c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i = 0;
        do {
            xmlPullParser.next();
            if (vp3.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = vp3.a(xmlPullParser, strConcat3);
                String strA2 = vp3.a(xmlPullParser, strConcat4);
                String strA3 = vp3.a(xmlPullParser, strConcat5);
                String strA4 = vp3.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return um2.f43723f;
                }
                gv1 gv1Var = new gv1(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L);
                int i10 = i + 1;
                if (objArrCopyOf.length < i10) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, k51.a(objArrCopyOf.length, i10));
                }
                objArrCopyOf[i] = gv1Var;
                i = i10;
            }
        } while (!vp3.b(xmlPullParser, strConcat2));
        return r51.b(i, objArrCopyOf);
    }

    public static hv1 a(String str) throws XmlPullParserException, IOException {
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (vp3.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            o51 o51Var = r51.f42498c;
            um2 um2VarA = um2.f43723f;
            long j11 = -9223372036854775807L;
            loop0: do {
                xmlPullParserNewPullParser.next();
                if (vp3.c(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = f44449a;
                    int i = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break loop0;
                        }
                        String strA = vp3.a(xmlPullParserNewPullParser, strArr[i10]);
                        if (strA == null) {
                            i10++;
                        } else if (Integer.parseInt(strA) == 1) {
                            String[] strArr2 = f44450b;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 4) {
                                    break;
                                }
                                String strA2 = vp3.a(xmlPullParserNewPullParser, strArr2[i11]);
                                if (strA2 != null) {
                                    j10 = Long.parseLong(strA2);
                                    if (j10 == -1) {
                                        break;
                                    }
                                } else {
                                    i11++;
                                }
                            }
                            j10 = -9223372036854775807L;
                            String[] strArr3 = f44451c;
                            while (true) {
                                if (i < 2) {
                                    String strA3 = vp3.a(xmlPullParserNewPullParser, strArr3[i]);
                                    if (strA3 != null) {
                                        um2VarA = r51.a(new gv1("image/jpeg", 0L, 0L), new gv1("video/mp4", Long.parseLong(strA3), 0L));
                                        break;
                                    }
                                    i++;
                                } else {
                                    o51 o51Var2 = r51.f42498c;
                                    um2VarA = um2.f43723f;
                                    break;
                                }
                            }
                            j11 = j10;
                        }
                    }
                    return null;
                }
                if (vp3.c(xmlPullParserNewPullParser, "Container:Directory")) {
                    um2VarA = a(xmlPullParserNewPullParser, "Container", "Item");
                } else if (vp3.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    um2VarA = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!vp3.b(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (um2VarA.isEmpty()) {
                return null;
            }
            return new hv1(j11, um2VarA);
        }
        throw new qb2("Couldn't find xmp metadata", null, true, 1);
    }
}
