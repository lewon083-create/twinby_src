package m;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(int i, Class cls, String str) {
        super(cls, str);
        this.f28332a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f28332a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).A);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(u6.b0.f34251a.r((View) obj));
            default:
                Field field = g2.n0.f19900a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f28332a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                u6.g gVar = (u6.g) obj;
                PointF pointF = (PointF) obj2;
                gVar.getClass();
                gVar.f34277a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                gVar.f34278b = iRound;
                int i = gVar.f34282f + 1;
                gVar.f34282f = i;
                if (i == gVar.f34283g) {
                    u6.b0.a(gVar.f34281e, gVar.f34277a, iRound, gVar.f34279c, gVar.f34280d);
                    gVar.f34282f = 0;
                    gVar.f34283g = 0;
                }
                break;
            case 2:
                u6.g gVar2 = (u6.g) obj;
                PointF pointF2 = (PointF) obj2;
                gVar2.getClass();
                gVar2.f34279c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                gVar2.f34280d = iRound2;
                int i10 = gVar2.f34283g + 1;
                gVar2.f34283g = i10;
                if (gVar2.f34282f == i10) {
                    u6.b0.a(gVar2.f34281e, gVar2.f34277a, gVar2.f34278b, gVar2.f34279c, iRound2);
                    gVar2.f34282f = 0;
                    gVar2.f34283g = 0;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                u6.b0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                u6.b0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                u6.b0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 6:
                u6.b0.b((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                Field field = g2.n0.f19900a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
