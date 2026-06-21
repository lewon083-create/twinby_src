package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vp implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18802a;

    public vp(sy syVar) {
        this.f18802a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sp resolve(ParsingContext parsingContext, yp ypVar, JSONObject jSONObject) {
        Field field = ypVar.f19159a;
        sy syVar = this.f18802a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, ypVar.f19161c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = wp.f18909a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19162d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.f19163e, jSONObject, "alignment_horizontal", wp.f18916h, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.f19164f, jSONObject, "alignment_vertical", wp.i, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.f19165g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, wp.f18919l, wp.f18909a);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19166h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.i, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = ypVar.f19168k;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper, function1, wp.f18910b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.f19169l, jSONObject, "clip_to_bounds", typeHelper, function1, wp.f18911c);
        Field field3 = ypVar.f19170m;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, function12, wp.f18920m);
        Field field4 = ypVar.f19171n;
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_state_id", typeHelper3);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19172o, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19174q, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19175r, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19177t, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, ypVar.f19178u, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = wp.f18912d;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19179v, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19180w, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.f19183z, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.C, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.D, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.E, jSONObject, "reuse_id", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.F, jSONObject, "row_span", typeHelper2, function12, wp.f18921n);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.G, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveList(parsingContext, ypVar.I, jSONObject, "states", syVar.f18507q7, syVar.f18488o7, wp.f18922o);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.J, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.L, jSONObject, "transition_animation_selector", wp.f18917j, kr.J, wp.f18913e);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.P, jSONObject, "transition_triggers", kv.f17646g, wp.f18923p);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.Q, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.R, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ypVar.S, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, wp.f18918k, kv.f17653o, wp.f18914f);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, ypVar.T, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, ypVar.U, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, ypVar.V, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = wp.f18915g;
        }
        return new sp(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
