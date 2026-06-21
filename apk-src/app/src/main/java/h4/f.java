package h4;

import android.util.Base64;
import java.util.UUID;
import k5.p;
import k5.r;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UUID f20408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f20409g;

    @Override // h4.d
    public final Object b() {
        UUID uuid = this.f20408f;
        byte[] bArrA = p.a(uuid, null, this.f20409g);
        byte[] bArr = this.f20409g;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb2.append((char) bArr[i]);
        }
        String string = sb2.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b2 = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b2;
        byte b10 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b10;
        byte b11 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b11;
        byte b12 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b12;
        return new a(uuid, bArrA, new r[]{new r(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // h4.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // h4.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f20407e = false;
        }
    }

    @Override // h4.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f20407e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f20408f = UUID.fromString(attributeValue);
        }
    }

    @Override // h4.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f20407e) {
            this.f20409g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
