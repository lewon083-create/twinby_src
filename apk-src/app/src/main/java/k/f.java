package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import l.i;
import m.w0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f26752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f26753f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f26754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f26755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f26756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26757d;

    static {
        Class[] clsArr = {Context.class};
        f26752e = clsArr;
        f26753f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f26756c = context;
        Object[] objArr = {context};
        this.f26754a = objArr;
        this.f26755b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        e eVar = new e(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z10 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z5 = z5;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            eVar.f26728b = 0;
                            eVar.f26729c = 0;
                            eVar.f26730d = 0;
                            eVar.f26731e = 0;
                            eVar.f26732f = true;
                            eVar.f26733g = true;
                        } else if (name2.equals("item")) {
                            if (!eVar.f26734h) {
                                eVar.f26734h = true;
                                eVar.b(eVar.f26727a.add(eVar.f26728b, eVar.i, eVar.f26735j, eVar.f26736k));
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z5 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z5 = z5;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z5 = z5;
                z10 = z10;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f26756c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f20304m);
                        eVar.f26728b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        eVar.f26729c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        eVar.f26730d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        eVar.f26731e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        eVar.f26732f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        eVar.f26733g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f20305n);
                            eVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            eVar.f26735j = (typedArrayObtainStyledAttributes2.getInt(5, eVar.f26729c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, eVar.f26730d) & 65535);
                            eVar.f26736k = typedArrayObtainStyledAttributes2.getText(7);
                            eVar.f26737l = typedArrayObtainStyledAttributes2.getText(8);
                            eVar.f26738m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            eVar.f26739n = string == null ? (char) 0 : string.charAt(0);
                            eVar.f26740o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            eVar.f26741p = string2 == null ? (char) 0 : string2.charAt(0);
                            eVar.f26742q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                eVar.f26743r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                eVar.f26743r = eVar.f26731e;
                            }
                            eVar.f26744s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            eVar.f26745t = typedArrayObtainStyledAttributes2.getBoolean(4, eVar.f26732f);
                            eVar.f26746u = typedArrayObtainStyledAttributes2.getBoolean(1, eVar.f26733g);
                            eVar.f26747v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            eVar.f26750y = typedArrayObtainStyledAttributes2.getString(12);
                            eVar.f26748w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            eVar.f26749x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && eVar.f26748w == 0 && eVar.f26749x == null) {
                                if (eVar.a(string3, f26753f, this.f26755b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z11) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            eVar.f26751z = typedArrayObtainStyledAttributes2.getText(17);
                            eVar.A = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                eVar.C = w0.c(typedArrayObtainStyledAttributes2.getInt(19, -1), eVar.C);
                            } else {
                                eVar.C = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = t1.b.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                eVar.B = colorStateList;
                            } else {
                                eVar.B = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            eVar.f26734h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            eVar.f26734h = true;
                            SubMenu subMenuAddSubMenu = eVar.f26727a.addSubMenu(eVar.f26728b, eVar.i, eVar.f26735j, eVar.f26736k);
                            eVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z5 = z5;
                        z10 = z10;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z5 = z5;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f26756c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th2) {
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
