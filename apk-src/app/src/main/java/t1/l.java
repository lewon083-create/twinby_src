package t1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.ads.om1;
import com.google.firebase.messaging.y;
import com.twinby.R;
import e1.d0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33355a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f33359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f33360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f33361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f33362h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33363j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0 f33365l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f33367n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f33370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f33371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notification f33372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f33373t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33356b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33357c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f33358d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33364k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33366m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33368o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33369p = 0;

    public l(Context context, String str) {
        Notification notification = new Notification();
        this.f33372s = notification;
        this.f33355a = context;
        this.f33370q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f33363j = 0;
        this.f33373t = new ArrayList();
        this.f33371r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i10;
        y yVar = new y();
        yVar.f14902e = new Bundle();
        yVar.f14901d = this;
        Context context = this.f33355a;
        yVar.f14899b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            yVar.f14900c = m.a(context, this.f33370q);
        } else {
            yVar.f14900c = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) yVar.f14900c;
        Notification notification = this.f33372s;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f33359e).setContentText(this.f33360f).setContentInfo(null).setContentIntent(this.f33361g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) yVar.f14900c;
        IconCompat iconCompat = this.f33362h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) yVar.f14900c).setSubText(null).setUsesChronometer(false).setPriority(this.f33363j);
        for (h hVar : this.f33356b) {
            if (hVar.f33345b == null && (i10 = hVar.f33348e) != 0) {
                hVar.f33345b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = hVar.f33345b;
            boolean z5 = hVar.f33346c;
            Bundle bundle2 = hVar.f33344a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(null) : null, hVar.f33349f, hVar.f33350g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z5);
            int i11 = Build.VERSION.SDK_INT;
            builder3.setAllowGeneratedReplies(z5);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i11 >= 28) {
                n.a(builder3);
            }
            if (i11 >= 29) {
                c.d(builder3);
            }
            if (i11 >= 31) {
                o.a(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", hVar.f33347d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) yVar.f14900c).addAction(builder3.build());
        }
        Bundle bundle4 = this.f33367n;
        if (bundle4 != null) {
            ((Bundle) yVar.f14902e).putAll(bundle4);
        }
        ((Notification.Builder) yVar.f14900c).setShowWhen(this.f33364k);
        ((Notification.Builder) yVar.f14900c).setLocalOnly(this.f33366m);
        ((Notification.Builder) yVar.f14900c).setGroup(null);
        ((Notification.Builder) yVar.f14900c).setSortKey(null);
        ((Notification.Builder) yVar.f14900c).setGroupSummary(false);
        ((Notification.Builder) yVar.f14900c).setCategory(null);
        ((Notification.Builder) yVar.f14900c).setColor(this.f33368o);
        ((Notification.Builder) yVar.f14900c).setVisibility(this.f33369p);
        ((Notification.Builder) yVar.f14900c).setPublicVersion(null);
        ((Notification.Builder) yVar.f14900c).setSound(notification.sound, notification.audioAttributes);
        int i12 = Build.VERSION.SDK_INT;
        ArrayList arrayList2 = this.f33373t;
        ArrayList arrayList3 = this.f33357c;
        if (i12 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw om1.i(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    h1.f fVar = new h1.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) yVar.f14900c).addPerson((String) it2.next());
            }
        }
        ArrayList arrayList4 = this.f33358d;
        if (arrayList4.size() > 0) {
            if (this.f33367n == null) {
                this.f33367n = new Bundle();
            }
            Bundle bundle5 = this.f33367n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                String string = Integer.toString(i13);
                h hVar2 = (h) arrayList4.get(i13);
                Bundle bundle8 = new Bundle();
                if (hVar2.f33345b == null && (i = hVar2.f33348e) != 0) {
                    hVar2.f33345b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = hVar2.f33345b;
                Bundle bundle9 = hVar2.f33344a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", hVar2.f33349f);
                bundle8.putParcelable("actionIntent", hVar2.f33350g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", hVar2.f33346c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", hVar2.f33347d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f33367n == null) {
                this.f33367n = new Bundle();
            }
            this.f33367n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) yVar.f14902e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) yVar.f14900c).setExtras(this.f33367n);
        ((Notification.Builder) yVar.f14900c).setRemoteInputHistory(null);
        if (i14 >= 26) {
            m.c((Notification.Builder) yVar.f14900c);
            m.e((Notification.Builder) yVar.f14900c);
            m.f((Notification.Builder) yVar.f14900c);
            m.g((Notification.Builder) yVar.f14900c);
            m.d((Notification.Builder) yVar.f14900c);
            if (!TextUtils.isEmpty(this.f33370q)) {
                ((Notification.Builder) yVar.f14900c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw om1.i(it3);
            }
        }
        if (i14 >= 29) {
            c.b((Notification.Builder) yVar.f14900c, this.f33371r);
            c.c((Notification.Builder) yVar.f14900c);
        }
        if (i14 >= 36) {
            p.a((Notification.Builder) yVar.f14900c);
        }
        l lVar = (l) yVar.f14901d;
        d0 d0Var = lVar.f33365l;
        if (d0Var != null) {
            d0Var.s(yVar);
        }
        Notification.Builder builder4 = (Notification.Builder) yVar.f14900c;
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder4.build() : builder4.build();
        if (d0Var != null) {
            lVar.f33365l.getClass();
        }
        if (d0Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", d0Var.t());
        }
        return notificationBuild;
    }

    public final void c(int i, boolean z5) {
        Notification notification = this.f33372s;
        if (z5) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f33355a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1321k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1323b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f33362h = iconCompat;
    }

    public final void e(d0 d0Var) {
        if (this.f33365l != d0Var) {
            this.f33365l = d0Var;
            if (((l) d0Var.f15951b) != this) {
                d0Var.f15951b = this;
                e(d0Var);
            }
        }
    }
}
