package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.firebase.messaging.y;
import g2.u1;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.SentryMaskingOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f25845y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f25847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f25848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f25849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f25850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f25851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f25852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f25853h;
    public g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f25854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f25855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f25858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f25859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f25860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f25861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m4.d f25863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f25866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f25867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.i f25868x;

    public h(View view, ka.k kVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.j jVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f25852g = new HashMap();
        this.f25853h = new HashMap();
        this.f25856l = 0;
        this.f25861q = new ArrayList();
        this.f25862r = 0;
        this.f25864t = false;
        this.f25865u = false;
        b bVar = new b(this);
        c cVar = new c(this);
        this.f25866v = cVar;
        com.google.android.gms.internal.auth.i iVar = new com.google.android.gms.internal.auth.i(this, new Handler(), 3);
        this.f25868x = iVar;
        this.f25846a = view;
        this.f25847b = kVar;
        this.f25848c = accessibilityManager;
        this.f25851f = contentResolver;
        this.f25849d = accessibilityViewEmbedder;
        this.f25850e = jVar;
        kVar.f27326e = bVar;
        ((FlutterJNI) kVar.f27325d).setAccessibilityDelegate(bVar);
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f25867w = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f25856l |= 128;
        iVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, iVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i == Integer.MAX_VALUE || i < 300) {
                this.f25856l &= -9;
            } else {
                this.f25856l |= 8;
            }
            ((FlutterJNI) kVar.f27325d).setAccessibilityFeatures(this.f25856l);
        }
        jVar.c(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        return strArr[i];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f25849d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f25855k = recordFlutterId;
            this.f25858n = null;
            return true;
        }
        if (eventType == 128) {
            this.f25860p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f25854j = recordFlutterId;
            this.i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f25855k = null;
        this.f25854j = null;
        return true;
    }

    public final f b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f25853h;
        f fVar = (f) map.get(numValueOf);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f25814c = -1;
        fVar2.f25813b = i;
        fVar2.f25812a = 267386881 + i;
        map.put(Integer.valueOf(i), fVar2);
        return fVar2;
    }

    public final g c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f25852g;
        g gVar = (g) map.get(numValueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f25819b = i;
        map.put(Integer.valueOf(i), gVar2);
        return gVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        boolean zG;
        String str;
        int i10;
        int i11;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f25849d;
        if (i >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
        }
        HashMap map = this.f25852g;
        View view = this.f25846a;
        if (i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        g gVar = (g) map.get(Integer.valueOf(i));
        if (gVar != null) {
            int i12 = gVar.i;
            io.flutter.plugin.platform.j jVar = this.f25850e;
            if (i12 == -1 || !jVar.o(i12)) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i);
                accessibilityNodeInfoObtain2.setImportantForAccessibility((gVar.g(12) || (g.b(gVar) == null && gVar.f25823d == 0)) ? false : true);
                accessibilityNodeInfoObtain2.setViewIdResourceName("");
                String str2 = gVar.f25833o;
                if (str2 != null) {
                    accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
                }
                accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
                accessibilityNodeInfoObtain2.setClassName("android.view.View");
                accessibilityNodeInfoObtain2.setSource(view, i);
                accessibilityNodeInfoObtain2.setFocusable(gVar.i());
                g gVar2 = this.f25858n;
                if (gVar2 != null) {
                    accessibilityNodeInfoObtain2.setFocused(gVar2.f25819b == i);
                }
                g gVar3 = this.i;
                if (gVar3 != null) {
                    accessibilityNodeInfoObtain2.setAccessibilityFocused(gVar3.f25819b == i);
                }
                if (gVar.g(5)) {
                    accessibilityNodeInfoObtain2.setPassword(gVar.g(11));
                    if (!gVar.g(21)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                    }
                    accessibilityNodeInfoObtain2.setEditable(!gVar.g(21));
                    int i13 = gVar.f25826g;
                    if (i13 != -1 && (i11 = gVar.f25827h) != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(i13, i11);
                    }
                    g gVar4 = this.i;
                    if (gVar4 != null && gVar4.f25819b == i) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                    if (g.a(gVar, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (g.a(gVar, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i10 = 1;
                    }
                    if (g.a(gVar, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i10 |= 2;
                    }
                    if (g.a(gVar, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i10 |= 2;
                    }
                    accessibilityNodeInfoObtain2.setMovementGranularities(i10);
                    if (gVar.f25824e >= 0) {
                        String str3 = gVar.f25836r;
                        accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - gVar.f25825f) + gVar.f25824e);
                    }
                }
                if (g.a(gVar, e.SET_SELECTION)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (g.a(gVar, e.COPY)) {
                    accessibilityNodeInfoObtain2.addAction(16384);
                }
                if (g.a(gVar, e.CUT)) {
                    accessibilityNodeInfoObtain2.addAction(65536);
                }
                if (g.a(gVar, e.PASTE)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
                if (g.a(gVar, e.SET_TEXT)) {
                    accessibilityNodeInfoObtain2.addAction(2097152);
                }
                if (gVar.g(4)) {
                    zG = true;
                } else {
                    String str4 = gVar.A;
                    zG = (str4 == null || str4.isEmpty()) ? gVar.g(23) : false;
                }
                if (zG) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
                }
                if (gVar.g(15)) {
                    accessibilityNodeInfoObtain2.setClassName(SentryMaskingOptions.IMAGE_VIEW_CLASS_NAME);
                }
                if (g.a(gVar, e.DISMISS)) {
                    accessibilityNodeInfoObtain2.setDismissable(true);
                    accessibilityNodeInfoObtain2.addAction(1048576);
                }
                g gVar5 = gVar.S;
                if (gVar5 != null) {
                    accessibilityNodeInfoObtain2.setParent(view, gVar5.f25819b);
                } else {
                    accessibilityNodeInfoObtain2.setParent(view);
                }
                int i14 = gVar.D;
                if (i14 != -1) {
                    accessibilityNodeInfoObtain2.setTraversalAfter(view, i14);
                }
                Rect rect = gVar.f25822c0;
                g gVar6 = gVar.S;
                if (gVar6 != null) {
                    Rect rect2 = gVar6.f25822c0;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
                } else {
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
                accessibilityNodeInfoObtain2.setVisibleToUser(true);
                accessibilityNodeInfoObtain2.setEnabled(!gVar.g(7) || gVar.g(8));
                if (g.a(gVar, e.TAP)) {
                    if (gVar.W != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, gVar.W.f25816e));
                        accessibilityNodeInfoObtain2.setClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.setClickable(true);
                    }
                } else if (gVar.g(24)) {
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.setClickable(true);
                }
                if (g.a(gVar, e.LONG_PRESS)) {
                    if (gVar.X != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gVar.X.f25816e));
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(32);
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    }
                }
                e eVar = e.SCROLL_LEFT;
                boolean zA = g.a(gVar, eVar);
                e eVar2 = e.SCROLL_DOWN;
                e eVar3 = e.SCROLL_UP;
                e eVar4 = e.SCROLL_RIGHT;
                if (zA || g.a(gVar, eVar3) || g.a(gVar, eVar4) || g.a(gVar, eVar2)) {
                    accessibilityNodeInfoObtain2.setScrollable(true);
                    if (gVar.g(19)) {
                        if (g.a(gVar, eVar) || g.a(gVar, eVar4)) {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(gVar)) {
                    if (g.a(gVar, eVar) || g.a(gVar, eVar4)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, gVar.f25828j, false));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionInfo(u1.v(gVar.f25828j));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gVar.f25828j, 1, false));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionInfo(u1.g(gVar.f25828j));
                    }
                }
                g gVar7 = gVar.S;
                if (gVar7 != null && k(gVar7) && gVar.S.g(19)) {
                    g gVar8 = gVar.S;
                    ArrayList arrayList = gVar8.T;
                    boolean z5 = (g.a(gVar8, eVar) || g.a(gVar8, eVar4)) ? false : true;
                    int iIndexOf = arrayList.indexOf(gVar);
                    if (z5) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iIndexOf, 1, 0, 1, gVar.g(10)));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(u1.h(iIndexOf, gVar.g(10)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIndexOf, 1, gVar.g(10)));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(u1.w(iIndexOf, gVar.g(10)));
                    }
                }
                if (g.a(gVar, eVar) || g.a(gVar, eVar3)) {
                    accessibilityNodeInfoObtain2.addAction(4096);
                }
                if (g.a(gVar, eVar4) || g.a(gVar, eVar2)) {
                    accessibilityNodeInfoObtain2.addAction(8192);
                }
                e eVar5 = e.INCREASE;
                boolean zA2 = g.a(gVar, eVar5);
                e eVar6 = e.DECREASE;
                if (zA2 || g.a(gVar, eVar6)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                    if (g.a(gVar, eVar5)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (g.a(gVar, eVar6)) {
                        accessibilityNodeInfoObtain2.addAction(8192);
                    }
                }
                if (gVar.g(16)) {
                    accessibilityNodeInfoObtain2.setLiveRegion(1);
                }
                if (gVar.g(5)) {
                    y yVar = new y();
                    yVar.f14899b = gVar.f25836r;
                    yVar.f14900c = gVar.f25837s;
                    yVar.f14901d = gVar.d();
                    accessibilityNodeInfoObtain2.setText(yVar.a());
                    if (Build.VERSION.SDK_INT >= 28) {
                        y yVar2 = new y();
                        yVar2.f14899b = gVar.f25834p;
                        yVar2.f14900c = gVar.f25835q;
                        yVar2.f14902e = gVar.A;
                        yVar2.f14901d = gVar.d();
                        SpannableString spannableStringA = yVar2.a();
                        y yVar3 = new y();
                        yVar3.f14899b = gVar.f25842x;
                        yVar3.f14900c = gVar.f25843y;
                        yVar3.f14901d = gVar.d();
                        CharSequence[] charSequenceArr = {spannableStringA, yVar3.a()};
                        int i15 = 0;
                        CharSequence charSequenceConcat = null;
                        for (int i16 = 2; i15 < i16; i16 = 2) {
                            CharSequence charSequence = charSequenceArr[i15];
                            if (charSequence != null && charSequence.length() > 0) {
                                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                            }
                            i15++;
                        }
                        accessibilityNodeInfoObtain2.setHintText(charSequenceConcat);
                    }
                } else if (!gVar.g(12)) {
                    CharSequence charSequenceB = g.b(gVar);
                    if (Build.VERSION.SDK_INT < 28 && gVar.f25844z != null) {
                        charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + gVar.f25844z;
                    }
                    if (charSequenceB != null) {
                        accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                    }
                }
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 28 && (str = gVar.f25844z) != null) {
                    accessibilityNodeInfoObtain2.setTooltipText(str);
                    if (g.b(gVar) == null) {
                        accessibilityNodeInfoObtain2.setContentDescription(gVar.f25844z);
                    }
                }
                boolean zG2 = gVar.g(1);
                boolean zG3 = gVar.g(17);
                accessibilityNodeInfoObtain2.setCheckable(zG2 || zG3);
                if (zG2) {
                    accessibilityNodeInfoObtain2.setChecked(gVar.g(2));
                    if (gVar.g(9)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (zG3) {
                    accessibilityNodeInfoObtain2.setChecked(gVar.g(18));
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                }
                accessibilityNodeInfoObtain2.setSelected(gVar.g(3));
                if (i17 >= 36 && gVar.g(27)) {
                    accessibilityNodeInfoObtain2.setExpandedState(gVar.g(28) ? 3 : 1);
                    if (g.a(gVar, e.EXPAND)) {
                        accessibilityNodeInfoObtain2.addAction(262144);
                    }
                    if (g.a(gVar, e.COLLAPSE)) {
                        accessibilityNodeInfoObtain2.addAction(524288);
                    }
                }
                if (i17 >= 28) {
                    accessibilityNodeInfoObtain2.setHeading(gVar.C > 0);
                }
                g gVar9 = this.i;
                if (gVar9 == null || gVar9.f25819b != i) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(128);
                }
                ArrayList<f> arrayList2 = gVar.V;
                if (arrayList2 != null) {
                    for (f fVar : arrayList2) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f25812a, fVar.f25815d));
                    }
                }
                for (g gVar10 : gVar.T) {
                    if (!gVar10.g(14)) {
                        int i18 = gVar10.i;
                        if (i18 != -1) {
                            View viewF = jVar.f(i18);
                            if (!jVar.o(gVar10.i) && viewF != null) {
                                viewF.setImportantForAccessibility(0);
                                accessibilityNodeInfoObtain2.addChild(viewF);
                            }
                        }
                        accessibilityNodeInfoObtain2.addChild(view, gVar10.f25819b);
                    }
                }
                return accessibilityNodeInfoObtain2;
            }
            View viewF2 = jVar.f(gVar.i);
            if (viewF2 != null) {
                return accessibilityViewEmbedder.getRootNode(viewF2, gVar.f25819b, gVar.f25822c0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i, int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        View view = this.f25846a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i);
        return accessibilityEventObtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z5) {
        g gVarH;
        if (this.f25848c.isTouchExplorationEnabled()) {
            HashMap map = this.f25852g;
            if (!map.isEmpty()) {
                g gVarH2 = ((g) map.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z5);
                if (gVarH2 == null || gVarH2.i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x10 = motionEvent.getX();
                        float y7 = motionEvent.getY();
                        if (!map.isEmpty() && (gVarH = ((g) map.get(0)).h(new float[]{x10, y7, 0.0f, 1.0f}, z5)) != this.f25860p) {
                            if (gVarH != null) {
                                h(gVarH.f25819b, 128);
                            }
                            g gVar = this.f25860p;
                            if (gVar != null) {
                                h(gVar.f25819b, 256);
                            }
                            this.f25860p = gVarH;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        g gVar2 = this.f25860p;
                        if (gVar2 != null) {
                            h(gVar2.f25819b, 256);
                            this.f25860p = null;
                        }
                    }
                    return true;
                }
                if (!z5) {
                    return this.f25849d.onAccessibilityHoverEvent(gVarH2.f25819b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            g gVar = this.f25858n;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f25819b);
            }
            Integer num = this.f25855k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        g gVar2 = this.i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f25819b);
        }
        Integer num2 = this.f25854j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(g gVar, int i, Bundle bundle, boolean z5) {
        int i10;
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = gVar.f25826g;
        int i13 = gVar.f25827h;
        if (i13 >= 0 && i12 >= 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8 || i11 == 16) {
                            if (z5) {
                                gVar.f25827h = gVar.f25836r.length();
                            } else {
                                gVar.f25827h = 0;
                            }
                        }
                    } else if (z5 && i13 < gVar.f25836r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f25836r.substring(gVar.f25827h));
                        if (matcher.find()) {
                            gVar.f25827h += matcher.start(1);
                        } else {
                            gVar.f25827h = gVar.f25836r.length();
                        }
                    } else if (!z5 && gVar.f25827h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f25836r.substring(0, gVar.f25827h));
                        if (matcher2.find()) {
                            gVar.f25827h = matcher2.start(1);
                        } else {
                            gVar.f25827h = 0;
                        }
                    }
                } else if (z5 && i13 < gVar.f25836r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f25836r.substring(gVar.f25827h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f25827h += matcher3.start(1);
                    } else {
                        gVar.f25827h = gVar.f25836r.length();
                    }
                } else if (!z5 && gVar.f25827h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f25836r.substring(0, gVar.f25827h));
                    if (matcher4.find()) {
                        gVar.f25827h = matcher4.start(1);
                    }
                }
            } else if (z5 && i13 < gVar.f25836r.length()) {
                gVar.f25827h++;
            } else if (!z5 && (i10 = gVar.f25827h) > 0) {
                gVar.f25827h = i10 - 1;
            }
            if (!z10) {
                gVar.f25826g = gVar.f25827h;
            }
        }
        if (i12 != gVar.f25826g || i13 != gVar.f25827h) {
            String str = gVar.f25836r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventE = e(gVar.f25819b, 8192);
            accessibilityEventE.getText().add(str);
            accessibilityEventE.setFromIndex(gVar.f25826g);
            accessibilityEventE.setToIndex(gVar.f25827h);
            accessibilityEventE.setItemCount(str.length());
            i(accessibilityEventE);
        }
        ka.k kVar = this.f25847b;
        if (i11 == 1) {
            if (z5) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.a(gVar, eVar)) {
                    kVar.D(i, eVar, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z5) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.a(gVar, eVar2)) {
                    kVar.D(i, eVar2, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 2) {
            if (z5) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.a(gVar, eVar3)) {
                    kVar.D(i, eVar3, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z5) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.a(gVar, eVar4)) {
                    kVar.D(i, eVar4, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 4 || i11 == 8 || i11 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i, int i10) {
        if (this.f25848c.isEnabled()) {
            i(e(i, i10));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f25848c.isEnabled()) {
            View view = this.f25846a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z5) {
        if (this.f25864t == z5) {
            return;
        }
        this.f25864t = z5;
        if (z5) {
            this.f25856l |= 1;
        } else {
            this.f25856l &= -2;
        }
        ((FlutterJNI) this.f25847b.f27325d).setAccessibilityFeatures(this.f25856l);
    }

    public final boolean k(g gVar) {
        if (gVar.f25828j > 1) {
            g gVar2 = this.i;
            g gVar3 = null;
            if (gVar2 != null) {
                g gVar4 = gVar2.S;
                while (true) {
                    if (gVar4 == null) {
                        gVar4 = null;
                        break;
                    }
                    if (gVar4 == gVar) {
                        break;
                    }
                    gVar4 = gVar4.S;
                }
                if (gVar4 != null) {
                    return true;
                }
            }
            g gVar5 = this.i;
            a aVar = new a();
            if (gVar5 != null) {
                g gVar6 = gVar5.S;
                while (true) {
                    if (gVar6 == null) {
                        break;
                    }
                    if (aVar.test(gVar6)) {
                        gVar3 = gVar6;
                        break;
                    }
                    gVar6 = gVar6.S;
                }
                if (gVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i10, Bundle bundle) {
        if (i >= 65536) {
            boolean zPerformAction = this.f25849d.performAction(i, i10, bundle);
            if (zPerformAction && i10 == 128) {
                this.f25854j = null;
            }
            return zPerformAction;
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f25852g;
        g gVar = (g) map.get(numValueOf);
        if (gVar != null) {
            e eVar = e.INCREASE;
            e eVar2 = e.DECREASE;
            ka.k kVar = this.f25847b;
            switch (i10) {
                case 16:
                    kVar.C(i, e.TAP);
                    return true;
                case 32:
                    kVar.C(i, e.LONG_PRESS);
                    return true;
                case 64:
                    if (this.i == null) {
                        this.f25846a.invalidate();
                    }
                    this.i = gVar;
                    kVar.C(i, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap map2 = new HashMap();
                    map2.put("type", "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(gVar.f25819b));
                    ((s7.g) kVar.f27324c).K(map2, null);
                    h(i, 32768);
                    if (!g.a(gVar, eVar) && !g.a(gVar, eVar2)) {
                        return true;
                    }
                    h(i, 4);
                    return true;
                case 128:
                    g gVar2 = this.i;
                    if (gVar2 != null && gVar2.f25819b == i) {
                        this.i = null;
                    }
                    Integer num = this.f25854j;
                    if (num != null && num.intValue() == i) {
                        this.f25854j = null;
                    }
                    kVar.C(i, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                    h(i, 65536);
                    return true;
                case 256:
                    return g(gVar, i, bundle, true);
                case 512:
                    return g(gVar, i, bundle, false);
                case 4096:
                    e eVar3 = e.SCROLL_UP;
                    if (g.a(gVar, eVar3)) {
                        kVar.C(i, eVar3);
                        return true;
                    }
                    e eVar4 = e.SCROLL_LEFT;
                    if (g.a(gVar, eVar4)) {
                        kVar.C(i, eVar4);
                        return true;
                    }
                    if (g.a(gVar, eVar)) {
                        gVar.f25836r = gVar.f25838t;
                        gVar.f25837s = gVar.f25839u;
                        h(i, 4);
                        kVar.C(i, eVar);
                        return true;
                    }
                    break;
                case 8192:
                    e eVar5 = e.SCROLL_DOWN;
                    if (g.a(gVar, eVar5)) {
                        kVar.C(i, eVar5);
                        return true;
                    }
                    e eVar6 = e.SCROLL_RIGHT;
                    if (g.a(gVar, eVar6)) {
                        kVar.C(i, eVar6);
                        return true;
                    }
                    if (g.a(gVar, eVar2)) {
                        gVar.f25836r = gVar.f25840v;
                        gVar.f25837s = gVar.f25841w;
                        h(i, 4);
                        kVar.C(i, eVar2);
                        return true;
                    }
                    break;
                case 16384:
                    kVar.C(i, e.COPY);
                    return true;
                case 32768:
                    kVar.C(i, e.PASTE);
                    return true;
                case 65536:
                    kVar.C(i, e.CUT);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put("base", Integer.valueOf(gVar.f25827h));
                        map3.put("extent", Integer.valueOf(gVar.f25827h));
                    }
                    kVar.D(i, e.SET_SELECTION, map3);
                    g gVar3 = (g) map.get(Integer.valueOf(i));
                    gVar3.f25826g = ((Integer) map3.get("base")).intValue();
                    gVar3.f25827h = ((Integer) map3.get("extent")).intValue();
                    return true;
                case 262144:
                    kVar.C(i, e.EXPAND);
                    return true;
                case 524288:
                    kVar.C(i, e.COLLAPSE);
                    return true;
                case 1048576:
                    kVar.C(i, e.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    kVar.D(i, e.SET_TEXT, string);
                    gVar.f25836r = string;
                    gVar.f25837s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    kVar.C(i, e.SHOW_ON_SCREEN);
                    return true;
                default:
                    f fVar = (f) this.f25853h.get(Integer.valueOf(i10 - 267386881));
                    if (fVar != null) {
                        kVar.D(i, e.CUSTOM_ACTION, Integer.valueOf(fVar.f25813b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
