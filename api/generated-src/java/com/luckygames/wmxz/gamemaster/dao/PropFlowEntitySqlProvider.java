package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PropFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PropFlowEntitySqlProvider {

    public String countByExample(PropFlowEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("prop_flow");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PropFlowEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("prop_flow");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PropFlowEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prop_flow");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("`name`", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            sql.VALUES("`count`", "#{count,jdbcType=INTEGER}");
        }
        
        if (record.getStrengtheningGrade() != null) {
            sql.VALUES("strengthening_grade", "#{strengtheningGrade,jdbcType=INTEGER}");
        }
        
        if (record.getStrengtheningDegreeCompletion() != null) {
            sql.VALUES("strengthening_degree_completion", "#{strengtheningDegreeCompletion,jdbcType=DECIMAL}");
        }
        
        if (record.getLuckyValue() != null) {
            sql.VALUES("lucky_value", "#{luckyValue,jdbcType=INTEGER}");
        }
        
        if (record.getSet() != null) {
            sql.VALUES("`set`", "#{set,jdbcType=VARCHAR}");
        }
        
        if (record.getClear() != null) {
            sql.VALUES("clear", "#{clear,jdbcType=VARCHAR}");
        }
        
        if (record.getUltimateAttribute() != null) {
            sql.VALUES("ultimate_attribute", "#{ultimateAttribute,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PropFlowEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("`type`");
        sql.SELECT("`name`");
        sql.SELECT("`count`");
        sql.SELECT("strengthening_grade");
        sql.SELECT("strengthening_degree_completion");
        sql.SELECT("lucky_value");
        sql.SELECT("`set`");
        sql.SELECT("clear");
        sql.SELECT("ultimate_attribute");
        sql.FROM("prop_flow");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PropFlowEntity record = (PropFlowEntity) parameter.get("record");
        PropFlowEntityExample example = (PropFlowEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("prop_flow");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            sql.SET("`count` = #{record.count,jdbcType=INTEGER}");
        }
        
        if (record.getStrengtheningGrade() != null) {
            sql.SET("strengthening_grade = #{record.strengtheningGrade,jdbcType=INTEGER}");
        }
        
        if (record.getStrengtheningDegreeCompletion() != null) {
            sql.SET("strengthening_degree_completion = #{record.strengtheningDegreeCompletion,jdbcType=DECIMAL}");
        }
        
        if (record.getLuckyValue() != null) {
            sql.SET("lucky_value = #{record.luckyValue,jdbcType=INTEGER}");
        }
        
        if (record.getSet() != null) {
            sql.SET("`set` = #{record.set,jdbcType=VARCHAR}");
        }
        
        if (record.getClear() != null) {
            sql.SET("clear = #{record.clear,jdbcType=VARCHAR}");
        }
        
        if (record.getUltimateAttribute() != null) {
            sql.SET("ultimate_attribute = #{record.ultimateAttribute,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("prop_flow");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        sql.SET("`count` = #{record.count,jdbcType=INTEGER}");
        sql.SET("strengthening_grade = #{record.strengtheningGrade,jdbcType=INTEGER}");
        sql.SET("strengthening_degree_completion = #{record.strengtheningDegreeCompletion,jdbcType=DECIMAL}");
        sql.SET("lucky_value = #{record.luckyValue,jdbcType=INTEGER}");
        sql.SET("`set` = #{record.set,jdbcType=VARCHAR}");
        sql.SET("clear = #{record.clear,jdbcType=VARCHAR}");
        sql.SET("ultimate_attribute = #{record.ultimateAttribute,jdbcType=VARCHAR}");
        
        PropFlowEntityExample example = (PropFlowEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PropFlowEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}