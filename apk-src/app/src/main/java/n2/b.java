package n2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import h2.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends g2.b {
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    private static final c NODE_ADAPTER = new le.a(2);
    private static final d SPARSE_VALUES_ADAPTER = new l7.b(3);
    private final View mHost;
    private final AccessibilityManager mManager;
    private a mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    int mKeyboardFocusedVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    private int mHoveredVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = n0.f19900a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final h2.f a(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        h2.f fVar = new h2.f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        fVar.i("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        accessibilityNodeInfoObtain.setParent(this.mHost);
        f(i, fVar);
        if (fVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        fVar.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(this.mHost.getContext().getPackageName());
        View view = this.mHost;
        fVar.f20361b = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            fVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            fVar.a(64);
        }
        boolean z5 = this.mKeyboardFocusedVirtualViewId == i;
        if (z5) {
            fVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            fVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z5);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfoObtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            fVar.f(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(this.mTempScreenRect);
                Rect rect2 = this.mTempScreenRect;
                if (rect2 != null && !rect2.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return fVar;
    }

    public abstract int b(float f10, float f11);

    public abstract void c(List list);

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b.d(int, android.graphics.Rect):boolean");
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = b(motionEvent.getX(), motionEvent.getY());
            int i10 = this.mHoveredVirtualViewId;
            if (i10 != iB) {
                this.mHoveredVirtualViewId = iB;
                sendEventForVirtualView(iB, 128);
                sendEventForVirtualView(i10, 256);
            }
            if (iB == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.mHoveredVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                sendEventForVirtualView(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 128);
                sendEventForVirtualView(i, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L75
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L5e
            r3 = 66
            if (r0 == r3) goto L46
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L46;
                default: goto L18;
            }
        L18:
            goto L75
        L19:
            boolean r5 = r7.hasNoModifiers()
            if (r5 == 0) goto L75
            r5 = 19
            if (r0 == r5) goto L31
            r5 = 21
            if (r0 == r5) goto L2e
            r5 = 22
            if (r0 == r5) goto L33
            r3 = 130(0x82, float:1.82E-43)
            goto L33
        L2e:
            r3 = 17
            goto L33
        L31:
            r3 = 33
        L33:
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r0 = r1
        L39:
            if (r1 >= r7) goto L45
            boolean r5 = r6.d(r3, r4)
            if (r5 == 0) goto L45
            int r1 = r1 + 1
            r0 = r2
            goto L39
        L45:
            return r0
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L75
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L75
            int r7 = r6.mKeyboardFocusedVirtualViewId
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L5d
            r0 = 16
            r6.e(r7, r0, r4)
        L5d:
            return r2
        L5e:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L6a
            r7 = 2
            boolean r7 = r6.d(r7, r4)
            return r7
        L6a:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L75
            boolean r7 = r6.d(r2, r4)
            return r7
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public abstract boolean e(int i, int i10, Bundle bundle);

    public abstract void f(int i, h2.f fVar);

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // g2.b
    public i getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new a(this);
        }
        return this.mNodeProvider;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public h2.f obtainAccessibilityNodeInfo(int i) {
        if (i != -1) {
            return a(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.mHost);
        h2.f fVar = new h2.f(accessibilityNodeInfoObtain);
        View view = this.mHost;
        Field field = n0.f19900a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.f20360a.addChild(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return fVar;
    }

    public final void onFocusChanged(boolean z5, int i, Rect rect) {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (z5) {
            d(i, rect);
        }
    }

    @Override // g2.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // g2.b
    public void onInitializeAccessibilityNodeInfo(View view, h2.f fVar) {
        super.onInitializeAccessibilityNodeInfo(view, fVar);
        onPopulateNodeForHost(fVar);
    }

    public abstract void onPopulateNodeForHost(h2.f fVar);

    public abstract void onVirtualViewKeyboardFocusChanged(int i, boolean z5);

    public boolean performAction(int i, int i10, Bundle bundle) {
        int i11;
        if (i == -1) {
            View view = this.mHost;
            Field field = n0.f19900a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i10 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i10 != 64) {
            if (i10 != 128) {
                return e(i, i10, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId != i) {
                return false;
            }
            this.mAccessibilityFocusedVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            this.mHost.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.mAccessibilityFocusedVirtualViewId = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            this.mHost.invalidate();
            sendEventForVirtualView(i11, 65536);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i10;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i10 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i10) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            h2.f fVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
            accessibilityEventObtain.getText().add(fVarObtainAccessibilityNodeInfo.g());
            AccessibilityNodeInfo accessibilityNodeInfo = fVarObtainAccessibilityNodeInfo.f20360a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            onPopulateEventForVirtualView(i, accessibilityEventObtain);
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(this.mHost, i);
            accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        return parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventObtain);
    }

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }
}
