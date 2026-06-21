package u6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.android.gms.internal.ads.om1;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final k STRAIGHT_PATH_MOTION = new m();
    private static ThreadLocal<h1.e> sRunningAnimators = new ThreadLocal<>();
    private ArrayList<z> mEndValuesList;
    private p mEpicenterCallback;
    private h1.e mNameOverrides;
    private ArrayList<z> mStartValuesList;
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private a0 mStartValues = new a0();
    private a0 mEndValues = new a0();
    x mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<q> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private k mPathMotion = STRAIGHT_PATH_MOTION;

    public static void a(a0 a0Var, View view, z zVar) {
        h1.e eVar = a0Var.f34243a;
        h1.e eVar2 = a0Var.f34246d;
        SparseArray sparseArray = a0Var.f34244b;
        h1.g gVar = a0Var.f34245c;
        eVar.put(view, zVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        Field field = n0.f19900a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (eVar2.containsKey(transitionName)) {
                eVar2.put(transitionName, null);
            } else {
                eVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar.f20332b) {
                    int i = gVar.f20335e;
                    long[] jArr = gVar.f20333c;
                    Object[] objArr = gVar.f20334d;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i; i11++) {
                        Object obj = objArr[i11];
                        if (obj != h1.h.f20336a) {
                            if (i11 != i10) {
                                jArr[i10] = jArr[i11];
                                objArr[i10] = obj;
                                objArr[i11] = null;
                            }
                            i10++;
                        }
                    }
                    gVar.f20332b = false;
                    gVar.f20335e = i10;
                }
                if (i1.a.b(gVar.f20333c, gVar.f20335e, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static h1.e c() {
        h1.e eVar = sRunningAnimators.get();
        if (eVar != null) {
            return eVar;
        }
        h1.e eVar2 = new h1.e(0);
        sRunningAnimators.set(eVar2);
        return eVar2;
    }

    public static boolean d(z zVar, z zVar2, String str) {
        Object obj = zVar.f34309a.get(str);
        Object obj2 = zVar2.f34309a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public r addListener(q qVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(qVar);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new m.b(3, this));
        animator.start();
    }

    public final void b(View view, boolean z5) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    z zVar = new z(view);
                    if (z5) {
                        captureStartValues(zVar);
                    } else {
                        captureEndValues(zVar);
                    }
                    zVar.f34311c.add(this);
                    capturePropagationValues(zVar);
                    if (z5) {
                        a(this.mStartValues, view, zVar);
                    } else {
                        a(this.mEndValues, view, zVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    if (this.mTargetTypeChildExcludes.get(i10).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                                b(viewGroup.getChildAt(i11), z5);
                            }
                        }
                    }
                }
            }
        }
    }

    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<q> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((q) arrayList2.get(i)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(z zVar);

    public abstract void captureStartValues(z zVar);

    public void captureValues(ViewGroup viewGroup, boolean z5) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        h1.e eVar;
        clearValues(z5);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    z zVar = new z(viewFindViewById);
                    if (z5) {
                        captureStartValues(zVar);
                    } else {
                        captureEndValues(zVar);
                    }
                    zVar.f34311c.add(this);
                    capturePropagationValues(zVar);
                    if (z5) {
                        a(this.mStartValues, viewFindViewById, zVar);
                    } else {
                        a(this.mEndValues, viewFindViewById, zVar);
                    }
                }
            }
            for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                View view = this.mTargets.get(i10);
                z zVar2 = new z(view);
                if (z5) {
                    captureStartValues(zVar2);
                } else {
                    captureEndValues(zVar2);
                }
                zVar2.f34311c.add(this);
                capturePropagationValues(zVar2);
                if (z5) {
                    a(this.mStartValues, view, zVar2);
                } else {
                    a(this.mEndValues, view, zVar2);
                }
            }
        } else {
            b(viewGroup, z5);
        }
        if (z5 || (eVar = this.mNameOverrides) == null) {
            return;
        }
        int i11 = eVar.f20340d;
        ArrayList arrayList3 = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList3.add(this.mStartValues.f34246d.remove((String) this.mNameOverrides.f(i12)));
        }
        for (int i13 = 0; i13 < i11; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.mStartValues.f34246d.put((String) this.mNameOverrides.i(i13), view2);
            }
        }
    }

    public void clearValues(boolean z5) {
        if (z5) {
            this.mStartValues.f34243a.clear();
            this.mStartValues.f34244b.clear();
            this.mStartValues.f34245c.a();
        } else {
            this.mEndValues.f34243a.clear();
            this.mEndValues.f34244b.clear();
            this.mEndValues.f34245c.a();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList<z> arrayList, ArrayList<z> arrayList2) {
        Animator animatorCreateAnimator;
        int i;
        View view;
        z zVar;
        Animator animator;
        z zVar2;
        h1.e eVarC = c();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            z zVar3 = arrayList.get(i10);
            z zVar4 = arrayList2.get(i10);
            if (zVar3 != null && !zVar3.f34311c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f34311c.contains(this)) {
                zVar4 = null;
            }
            if (!(zVar3 == null && zVar4 == null) && ((zVar3 == null || zVar4 == null || isTransitionRequired(zVar3, zVar4)) && (animatorCreateAnimator = createAnimator(viewGroup, zVar3, zVar4)) != null)) {
                if (zVar4 != null) {
                    view = zVar4.f34310b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        zVar2 = new z(view);
                        z zVar5 = (z) a0Var2.f34243a.get(view);
                        if (zVar5 != null) {
                            int i11 = 0;
                            while (i11 < transitionProperties.length) {
                                String str = transitionProperties[i11];
                                zVar2.f34309a.put(str, zVar5.f34309a.get(str));
                                i11++;
                                size = size;
                            }
                        }
                        i = size;
                        int i12 = eVarC.f20340d;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= i12) {
                                animator = animatorCreateAnimator;
                                break;
                            }
                            o oVar = (o) eVarC.get((Animator) eVarC.f(i13));
                            if (oVar.f34291c != null && oVar.f34289a == view && oVar.f34290b.equals(getName()) && oVar.f34291c.equals(zVar2)) {
                                animator = null;
                                break;
                            }
                            i13++;
                        }
                    } else {
                        i = size;
                        animator = animatorCreateAnimator;
                        zVar2 = null;
                    }
                    animatorCreateAnimator = animator;
                    zVar = zVar2;
                } else {
                    i = size;
                    view = zVar3.f34310b;
                    zVar = null;
                }
                if (animatorCreateAnimator != null) {
                    String name = getName();
                    c0 c0Var = b0.f34251a;
                    h0 h0Var = new h0(viewGroup);
                    o oVar2 = new o();
                    oVar2.f34289a = view;
                    oVar2.f34290b = name;
                    oVar2.f34291c = zVar;
                    oVar2.f34292d = h0Var;
                    oVar2.f34293e = this;
                    eVarC.put(animatorCreateAnimator, oVar2);
                    this.mAnimators.add(animatorCreateAnimator);
                }
            } else {
                i = size;
            }
            i10++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator2 = this.mAnimators.get(sparseIntArray.keyAt(i14));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE));
            }
        }
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<q> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q) arrayList2.get(i10)).a(this);
                }
            }
            for (int i11 = 0; i11 < this.mStartValues.f34245c.e(); i11++) {
                View view = (View) this.mStartValues.f34245c.f(i11);
                if (view != null) {
                    Field field = n0.f19900a;
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.mEndValues.f34245c.e(); i12++) {
                View view2 = (View) this.mEndValues.f34245c.f(i12);
                if (view2 != null) {
                    Field field2 = n0.f19900a;
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public p getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u6.z getMatchedTransitionValues(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            u6.x r0 = r5.mParent
            if (r0 == 0) goto L9
            u6.z r6 = r0.getMatchedTransitionValues(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<u6.z> r0 = r5.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<u6.z> r0 = r5.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            u6.z r4 = (u6.z) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f34310b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<u6.z> r6 = r5.mEndValuesList
            goto L36
        L34:
            java.util.ArrayList<u6.z> r6 = r5.mStartValuesList
        L36:
            java.lang.Object r6 = r6.get(r3)
            u6.z r6 = (u6.z) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.r.getMatchedTransitionValues(android.view.View, boolean):u6.z");
    }

    public String getName() {
        return this.mName;
    }

    public k getPathMotion() {
        return this.mPathMotion;
    }

    public w getPropagation() {
        return null;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public z getTransitionValues(View view, boolean z5) {
        x xVar = this.mParent;
        if (xVar != null) {
            return xVar.getTransitionValues(view, z5);
        }
        return (z) (z5 ? this.mStartValues : this.mEndValues).f34243a.get(view);
    }

    public boolean isTransitionRequired(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (d(zVar, zVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zVar.f34309a.keySet().iterator();
                while (it.hasNext()) {
                    if (d(zVar, zVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            Field field = n0.f19900a;
            if (view.getTransitionName() != null && this.mTargetNameExcludes.contains(view.getTransitionName())) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            Field field2 = n0.f19900a;
            if (arrayList6.contains(view.getTransitionName())) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i10 = 0; i10 < this.mTargetTypes.size(); i10++) {
                if (this.mTargetTypes.get(i10).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).pause();
        }
        ArrayList<q> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((q) arrayList2.get(i)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        o oVar;
        View view;
        z zVar;
        View view2;
        View view3;
        View view4;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        a0 a0Var = this.mStartValues;
        a0 a0Var2 = this.mEndValues;
        h1.e eVar = new h1.e(a0Var.f34243a);
        h1.e eVar2 = new h1.e(a0Var2.f34243a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                break;
            }
            int i10 = iArr[i];
            if (i10 == 1) {
                for (int i11 = eVar.f20340d - 1; i11 >= 0; i11--) {
                    View view5 = (View) eVar.f(i11);
                    if (view5 != null && isValidTarget(view5) && (zVar = (z) eVar2.remove(view5)) != null && isValidTarget(zVar.f34310b)) {
                        this.mStartValuesList.add((z) eVar.g(i11));
                        this.mEndValuesList.add(zVar);
                    }
                }
            } else if (i10 == 2) {
                h1.e eVar3 = a0Var.f34246d;
                h1.e eVar4 = a0Var2.f34246d;
                int i12 = eVar3.f20340d;
                for (int i13 = 0; i13 < i12; i13++) {
                    View view6 = (View) eVar3.i(i13);
                    if (view6 != null && isValidTarget(view6) && (view2 = (View) eVar4.get(eVar3.f(i13))) != null && isValidTarget(view2)) {
                        z zVar2 = (z) eVar.get(view6);
                        z zVar3 = (z) eVar2.get(view2);
                        if (zVar2 != null && zVar3 != null) {
                            this.mStartValuesList.add(zVar2);
                            this.mEndValuesList.add(zVar3);
                            eVar.remove(view6);
                            eVar2.remove(view2);
                        }
                    }
                }
            } else if (i10 == 3) {
                SparseArray sparseArray = a0Var.f34244b;
                SparseArray sparseArray2 = a0Var2.f34244b;
                int size = sparseArray.size();
                for (int i14 = 0; i14 < size; i14++) {
                    View view7 = (View) sparseArray.valueAt(i14);
                    if (view7 != null && isValidTarget(view7) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && isValidTarget(view3)) {
                        z zVar4 = (z) eVar.get(view7);
                        z zVar5 = (z) eVar2.get(view3);
                        if (zVar4 != null && zVar5 != null) {
                            this.mStartValuesList.add(zVar4);
                            this.mEndValuesList.add(zVar5);
                            eVar.remove(view7);
                            eVar2.remove(view3);
                        }
                    }
                }
            } else if (i10 == 4) {
                h1.g gVar = a0Var.f34245c;
                h1.g gVar2 = a0Var2.f34245c;
                int iE = gVar.e();
                for (int i15 = 0; i15 < iE; i15++) {
                    View view8 = (View) gVar.f(i15);
                    if (view8 != null && isValidTarget(view8) && (view4 = (View) gVar2.b(gVar.c(i15))) != null && isValidTarget(view4)) {
                        z zVar6 = (z) eVar.get(view8);
                        z zVar7 = (z) eVar2.get(view4);
                        if (zVar6 != null && zVar7 != null) {
                            this.mStartValuesList.add(zVar6);
                            this.mEndValuesList.add(zVar7);
                            eVar.remove(view8);
                            eVar2.remove(view4);
                        }
                    }
                }
            }
            i++;
        }
        for (int i16 = 0; i16 < eVar.f20340d; i16++) {
            z zVar8 = (z) eVar.i(i16);
            if (isValidTarget(zVar8.f34310b)) {
                this.mStartValuesList.add(zVar8);
                this.mEndValuesList.add(null);
            }
        }
        for (int i17 = 0; i17 < eVar2.f20340d; i17++) {
            z zVar9 = (z) eVar2.i(i17);
            if (isValidTarget(zVar9.f34310b)) {
                this.mEndValuesList.add(zVar9);
                this.mStartValuesList.add(null);
            }
        }
        h1.e eVarC = c();
        int i18 = eVarC.f20340d;
        c0 c0Var = b0.f34251a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i19 = i18 - 1; i19 >= 0; i19--) {
            Animator animator = (Animator) eVarC.f(i19);
            if (animator != null && (oVar = (o) eVarC.get(animator)) != null && (view = oVar.f34289a) != null && oVar.f34292d.f34284a.equals(windowId)) {
                z zVar10 = oVar.f34291c;
                z transitionValues = getTransitionValues(view, true);
                z matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = (z) this.mEndValues.f34243a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && oVar.f34293e.isTransitionRequired(zVar10, matchedTransitionValues)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        eVarC.remove(animator);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public r removeListener(q qVar) {
        ArrayList<q> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(qVar);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<q> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((q) arrayList2.get(i)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        h1.e eVarC = c();
        for (Animator animator : this.mAnimators) {
            if (eVarC.containsKey(animator)) {
                start();
                if (animator != null) {
                    animator.addListener(new n(this, eVarC));
                    animate(animator);
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public r setDuration(long j10) {
        this.mDuration = j10;
        return this;
    }

    public void setEpicenterCallback(p pVar) {
        this.mEpicenterCallback = pVar;
    }

    public r setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setPathMotion(k kVar) {
        if (kVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = kVar;
        }
    }

    public r setStartDelay(long j10) {
        this.mStartDelay = j10;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<q> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((q) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder sbJ = pe.a.j(str);
        sbJ.append(getClass().getSimpleName());
        sbJ.append("@");
        sbJ.append(Integer.toHexString(hashCode()));
        sbJ.append(": ");
        String string = sbJ.toString();
        if (this.mDuration != -1) {
            string = pe.a.h(pe.a.k(string, "dur("), this.mDuration, ") ");
        }
        if (this.mStartDelay != -1) {
            string = pe.a.h(pe.a.k(string, "dly("), this.mStartDelay, ") ");
        }
        if (this.mInterpolator != null) {
            StringBuilder sbK = pe.a.k(string, "interp(");
            sbK.append(this.mInterpolator);
            sbK.append(") ");
            string = sbK.toString();
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return string;
        }
        String strX = om1.x(string, "tgts(");
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    strX = om1.x(strX, ", ");
                }
                StringBuilder sbJ2 = pe.a.j(strX);
                sbJ2.append(this.mTargetIds.get(i));
                strX = sbJ2.toString();
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i10 = 0; i10 < this.mTargets.size(); i10++) {
                if (i10 > 0) {
                    strX = om1.x(strX, ", ");
                }
                StringBuilder sbJ3 = pe.a.j(strX);
                sbJ3.append(this.mTargets.get(i10));
                strX = sbJ3.toString();
            }
        }
        return om1.x(strX, ")");
    }

    @Override // 
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.mAnimators = new ArrayList<>();
            rVar.mStartValues = new a0();
            rVar.mEndValues = new a0();
            rVar.mStartValuesList = null;
            rVar.mEndValuesList = null;
            return rVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void capturePropagationValues(z zVar) {
    }

    public void setPropagation(w wVar) {
    }

    public String toString() {
        return toString("");
    }
}
