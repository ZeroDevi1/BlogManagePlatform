package frodez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.cloud.CloudServiceConnectorsAutoConfiguration;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.ldap.LdapRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.elasticsearch.jest.JestAutoConfiguration;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration;
import org.springframework.boot.autoconfigure.influx.InfluxDbAutoConfiguration;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration;
import org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.reactive.ReactiveOAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.sendgrid.SendGridAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration;
import org.springframework.boot.autoconfigure.webservices.client.WebServiceTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketMessagingAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类(根据情况精简了加载类)
 * @author Frodez
 * @date 2019-01-07
 */
@EnableJms
@MapperScan(basePackages = { "frodez.dao.mapper" })
@SpringBootApplication(exclude = { ArtemisAutoConfiguration.class, BatchAutoConfiguration.class,
	CacheAutoConfiguration.class, CassandraAutoConfiguration.class, CassandraDataAutoConfiguration.class,
	CassandraReactiveDataAutoConfiguration.class, CassandraReactiveRepositoriesAutoConfiguration.class,
	CassandraRepositoriesAutoConfiguration.class, ClientHttpConnectorAutoConfiguration.class,
	CloudServiceConnectorsAutoConfiguration.class, CouchbaseAutoConfiguration.class,
	CouchbaseDataAutoConfiguration.class, CouchbaseReactiveDataAutoConfiguration.class,
	CouchbaseReactiveRepositoriesAutoConfiguration.class, CouchbaseRepositoriesAutoConfiguration.class,
	XADataSourceAutoConfiguration.class, WebSocketServletAutoConfiguration.class,
	WebSocketMessagingAutoConfiguration.class, WebSocketReactiveAutoConfiguration.class,
	WebServicesAutoConfiguration.class, WebServiceTemplateAutoConfiguration.class, WebFluxAutoConfiguration.class,
	WebClientAutoConfiguration.class, ThymeleafAutoConfiguration.class, SessionAutoConfiguration.class,
	SolrAutoConfiguration.class, SolrRepositoriesAutoConfiguration.class, SendGridAutoConfiguration.class,
	UserDetailsServiceAutoConfiguration.class, RepositoryRestMvcAutoConfiguration.class,
	RestClientAutoConfiguration.class, ReactiveWebServerFactoryAutoConfiguration.class,
	ReactiveUserDetailsServiceAutoConfiguration.class, ReactiveOAuth2ClientAutoConfiguration.class,
	ReactiveOAuth2ResourceServerAutoConfiguration.class, ReactiveSecurityAutoConfiguration.class,
	RabbitAutoConfiguration.class, QuartzAutoConfiguration.class, ProjectInfoAutoConfiguration.class,
	OAuth2ClientAutoConfiguration.class, OAuth2ResourceServerAutoConfiguration.class, Neo4jDataAutoConfiguration.class,
	Neo4jRepositoriesAutoConfiguration.class, MustacheAutoConfiguration.class, MongoRepositoriesAutoConfiguration.class,
	MongoReactiveAutoConfiguration.class, MongoReactiveRepositoriesAutoConfiguration.class,
	MongoReactiveDataAutoConfiguration.class, MongoDataAutoConfiguration.class, MongoAutoConfiguration.class,
	MessageSourceAutoConfiguration.class, LiquibaseAutoConfiguration.class, LdapRepositoriesAutoConfiguration.class,
	LdapAutoConfiguration.class, KafkaAutoConfiguration.class, JtaAutoConfiguration.class, JsonbAutoConfiguration.class,
	JpaRepositoriesAutoConfiguration.class, JooqAutoConfiguration.class, JndiDataSourceAutoConfiguration.class,
	JndiConnectionFactoryAutoConfiguration.class, JestAutoConfiguration.class, JerseyAutoConfiguration.class,
	JdbcRepositoriesAutoConfiguration.class, IntegrationAutoConfiguration.class, InfluxDbAutoConfiguration.class,
	HypermediaAutoConfiguration.class, HttpHandlerAutoConfiguration.class, HibernateJpaAutoConfiguration.class,
	HazelcastJpaDependencyAutoConfiguration.class, HazelcastAutoConfiguration.class, H2ConsoleAutoConfiguration.class,
	GsonAutoConfiguration.class, GroovyTemplateAutoConfiguration.class, FreeMarkerAutoConfiguration.class,
	FlywayAutoConfiguration.class, ErrorWebFluxAutoConfiguration.class, EmbeddedMongoAutoConfiguration.class,
	EmbeddedLdapAutoConfiguration.class, ElasticsearchRepositoriesAutoConfiguration.class,
	ElasticsearchDataAutoConfiguration.class, ElasticsearchAutoConfiguration.class })
public class BlogManagePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogManagePlatformApplication.class, args);
	}
}
