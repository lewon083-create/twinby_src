package yads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w40 extends k6.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk3 f44271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ll3 f44272b;

    public /* synthetic */ w40(dc1 dc1Var, z70 z70Var) {
        this(new zk3(dc1Var, z70Var), new ll3());
    }

    @Override // androidx.recyclerview.widget.g
    public final int getItemViewType(int i) {
        ba0 ba0Var = (ba0) getItem(i);
        this.f44272b.getClass();
        if (ba0Var instanceof u90) {
            return R$layout.debug_panel_item_action_button;
        }
        if (ba0Var instanceof aa0) {
            return R$layout.debug_panel_item_switch;
        }
        if (ba0Var instanceof v90) {
            return R$layout.debug_panel_item_divider;
        }
        if (ba0Var instanceof w90) {
            return R$layout.deubg_panel_item_header;
        }
        if (ba0Var instanceof x90) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (ba0Var instanceof y90) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (ba0Var instanceof s90) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (ba0Var instanceof r90) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new ij.j();
    }

    @Override // androidx.recyclerview.widget.g
    public final void onBindViewHolder(androidx.recyclerview.widget.p pVar, int i) {
        ((ea0) pVar).a((ba0) getItem(i));
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.p onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        zk3 zk3Var = this.f44271a;
        zk3Var.getClass();
        return i == R$layout.debug_panel_item_action_button ? new n0(sk3.f42961b, viewInflate) : i == R$layout.debug_panel_item_switch ? new f53(viewInflate, new uk3(zk3Var)) : i == R$layout.deubg_panel_item_header ? new v01(viewInflate) : i == R$layout.deubg_panel_item_key_value ? new le1(viewInflate) : i == R$layout.debug_panel_item_mediation_adapter ? new or1(viewInflate, zk3Var.f45449b, new vk3(zk3Var), new wk3(zk3Var)) : i == R$layout.debug_panel_item_ad_units ? new rb(viewInflate, new xk3(zk3Var)) : i == R$layout.debug_panel_item_ad_unit ? new pb(new yk3(zk3Var), viewInflate) : new yi0(viewInflate);
    }

    public w40(zk3 zk3Var, ll3 ll3Var) {
        super(new t70());
        this.f44271a = zk3Var;
        this.f44272b = ll3Var;
    }
}
