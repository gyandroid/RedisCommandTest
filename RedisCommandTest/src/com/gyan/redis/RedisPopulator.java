package com.gyan.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.PipelineBlock;

public class RedisPopulator {

	public static void main(String[] args) throws InterruptedException {
		Jedis j = new Jedis("localhost", 6379);
		j.connect();
		System.out.println("Connected");

		try {
			populateUpdateTable(j);
			populateMetaTable(j);

		} finally {
			j.disconnect();
			System.out.println("\nDisconnected");
		}
	}

	private static void populateMetaTable(Jedis j) {
		System.out.println("\n[Map<String, Map<String, String>>]");

		j.pipelined(new PipelineBlock() {
			@Override
			public void execute() {
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"measures", "temperature");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"lat", "33.329925");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"long", "-79.245807");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_2");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
						"units", "degree celsius");

				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"measures", "conductivity");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"lat", "33.329925");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"long", "-79.245807");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_2");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
						"units", "deciseimansPerMeter");

				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"measures", "depth");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"lat", "33.329925");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"long", "-79.245807");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_2");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
						"units", "millimeters");

				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"measures", "temperature");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"lat", "33.330414");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"long", "-79.248515");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_1");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
						"units", "degree celsius");

				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"measures", "depth");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"lat", "33.330414");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"long", "-79.248515");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_1");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
						"units", "millimeters");

				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"measures", "conducivity");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"lat", "33.330414");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"long", "-79.248515");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"depURI",
						"http://www.intelligentriver.org/resource/deployment#bar_1");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"projectURI",
						"http://www.intelligentriver.org/resource/ir#hasProjectUri-5");
				hset("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
						"units", "deciseimansPerMeter");

			}
		});

		print("hgetAll(\"sensor1\")",
				j.hgetAll("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96"));
		print("hgetAll(\"sensor5\")",
				j.hgetAll("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50"));
		print("hgetAll(\"sensor6\")",
				j.hgetAll("meta:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355"));

	}

	private static void populateUpdateTable(Jedis j) {

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96

		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T19:40:02Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T19:45:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T19:50:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T19:55:04Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T20:00:05Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"2013-11-15T20:05:06Z");
		// j.ltrim("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
		// 0, 5);

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.4");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.3");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.4");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.4");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.4");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
				"19.4");

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0

		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T19:40:02Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T19:45:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T19:50:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T19:55:04Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T20:00:05Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"2013-11-15T20:05:06Z");

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"216");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"219");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"217");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"210");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"217");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-66789b9c-c664-412c-8c41-b09350ccbfc0",
				"221");

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T19:40:02Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T19:45:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T19:50:03Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T19:55:04Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T20:00:05Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"2013-11-15T20:05:06Z");
		// j.ltrim("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",
		// 0, 5);

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e8316af4-952b-444d-9174-ec97ab82a5eb",
				"201");

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8

		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-10-28T14:41:35Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-10-28T14:46:36Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-11-08T22:16:00Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-11-08T22:19:31Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-11-08T22:22:14Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"2013-11-08T22:43:37Z");

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"17.3");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"17.3");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"0");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"0");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"0");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-a9df8087-86a9-4513-8197-0d42ec6343d8",
				"0");

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50

		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-10-28T14:41:35Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-10-28T14:46:36Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-11-08T22:16:00Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-11-08T22:19:31Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-11-08T22:22:14Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"2013-11-08T22:43:37Z");

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"694");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"693");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"1.13");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"1.16");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"1,15");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-05bd54cd-5c30-435f-b8f7-33dd46e4ad50",
				"1.15");

		// http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355

		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-10-28T14:41:35Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-10-28T14:46:36Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-11-08T22:16:00Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-11-08T22:19:31Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-11-08T22:22:14Z");
		j.lpush("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"2013-11-08T22:43:37Z");

		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"7882");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"7855");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"24.8");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"24.2");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"23.9");
		j.lpush("mval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-e74023ef-a292-4f9f-acb7-f82d523b1355",
				"23.7");
		
		print("lrange(\"sensor1\")",
				j.lrange("timeval:http://www.intelligentriver.org/resource/ir#sdi12Sensor-999f599d-aafd-4f97-afcf-4ebc4d7d7b96",0,0));

	}

	static void print(String command, Object result) {
		System.out.printf("%-55s:  %s%n", command, result);
	}

}
